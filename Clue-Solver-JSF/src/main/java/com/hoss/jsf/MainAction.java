package com.hoss.jsf;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.Card;
import model.Triple;
import model.TripleList;
import model.rest.ProbabilityReport;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ClientResource;
import service.ServerService;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chostrander
 */
@ManagedBean(name = "mainAction")
@SessionScoped
public class MainAction implements Serializable {

    @ManagedProperty(value = "")
    private String cardElim;
    @ManagedProperty(value = "")
    private String cardType;
    private List<Triple> remainingTriples;
    private String mostLikelyTripleTxt;
    private String mostLikelyTriplePct;

    public void updateMostLikelyTriple() {
        System.out.println("Updating Most likely triple");
        final Reference reference = new Reference("http://localhost/clue/probability.json");
        reference.setHostPort(ServerService.getPort());

        final ClientResource resource = new ClientResource(reference);
        resource.setProtocol(Protocol.HTTP);
        resource.setChallengeResponse(ServerService.getChallengeResponse());

        ProbabilityReport report = resource.get(ProbabilityReport.class);
        Triple mostLikelyTriple = report.getMostLikelyTriple().getWrappedObject();
        this.mostLikelyTriplePct = Double.toString((report.getMostLikelyTriple().getCardProbability()) * 100);
        this.mostLikelyTripleTxt = mostLikelyTriple.toString();
        resource.release();
    }

    public RoomEnum[] getRooms() {
        return RoomEnum.values();
    }

    public SuspectEnum[] getSuspects() {
        return SuspectEnum.values();
    }

    public WeaponEnum[] getWeapons() {
        return WeaponEnum.values();
    }

    public String getMostLikelyTripleTxt() {
        updateMostLikelyTriple();

        return this.mostLikelyTripleTxt;
    }

    public void setMostLikelyTripleTxt(String value) {
        this.mostLikelyTripleTxt = value;
    }

    public List<Triple> getRemainingTriples() {
        System.out.println("Get Remaining Triples");
        final Reference reference = new Reference("http://localhost/clue/triples/remaining.json");
        reference.setHostPort(ServerService.getPort());

        final ClientResource resource = new ClientResource(reference);
        resource.setProtocol(Protocol.HTTP);
        resource.setChallengeResponse(ServerService.getChallengeResponse());

        final TripleList response = resource.get(TripleList.class);
        resource.release();

        this.remainingTriples = response;

        return this.remainingTriples;
    }

    public void setRemainingTriples(List<Triple> values) {
        this.remainingTriples = values;
    }

    public String doCardElimination() {
        System.out.println("-----------> Value is " + this.cardType + "/" + this.cardElim);

        final Reference reference = new Reference("http://localhost/clue/cards");
        reference.setHostPort(ServerService.getPort());

        final ClientResource client = new ClientResource(reference);
        client.setChallengeResponse(ServerService.getChallengeResponse());

        client.put(new JacksonRepresentation<Card>(findTheCard(this.cardType, this.cardType)));

        client.release();

        return "main";
    }

    public String getCardElim() {
        return cardElim;
    }

    public void setCardElim(String cardElim) {
        System.out.println("calling cardElim setter.." + this.cardElim);
        this.cardElim = cardElim;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    private Card findTheCard(String cardName, String cardType) {
        Card result = null;
        if (cardType.equalsIgnoreCase("room")) {
            for (RoomEnum room : RoomEnum.values()) {
                if (room.getName().equalsIgnoreCase(cardName)) {
                    return new Card(cardType, cardName);
                }
            }
        } else if (cardType.equalsIgnoreCase("suspect")) {
            for (SuspectEnum suspect : SuspectEnum.values()) {
                if (suspect.name().equalsIgnoreCase(cardName)) {
                    return new Card(cardType, cardName);
                }
            }
        } else if (cardType.equalsIgnoreCase("weapons")) {
            for (WeaponEnum weapon : WeaponEnum.values()) {
                if (weapon.name().equalsIgnoreCase(cardName)) {
                    return new Card(cardType, cardName);
                }
            }
        }
        return result;
    }

    public String getMostLikelyTriplePct() {
        return mostLikelyTriplePct;
    }

    public void setMostLikelyTriplePct(String mostLikelyTriplePct) {
        this.mostLikelyTriplePct = mostLikelyTriplePct;
    }
}
