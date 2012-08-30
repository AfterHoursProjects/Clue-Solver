package com.hoss.jsf;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGrid;
import model.Triple;
import model.TripleList;
import model.rest.ProbabilityReport;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
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
        
    private RoomEnum[] rooms;
    
    @ManagedProperty (value="")
    private String cardElim;

 
    
    private HtmlPanelGrid eliminateCardComponenets = null;
    private List<Triple> remainingTriples;
    private String mostLikelyTripleTxt;

    public void updateMostLikelyTriple() {
        final Reference reference = new Reference("http://localhost/clue/probability.json");
        reference.setHostPort(ServerService.getPort());

        final ClientResource resource = new ClientResource(reference);
        resource.setProtocol(Protocol.HTTP);
        resource.setChallengeResponse(ServerService.getChallengeResponse());

        ProbabilityReport report = resource.get(ProbabilityReport.class);
        Triple mostLikelyTriple = report.getMostLikelyTriple().getWrappedObject();
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
    
    public String doCardElimination(String value) {
        System.out.println("-----------> Value is "+ value);
        return "main";
    }
    
       public String getCardElim() {
        return cardElim;
    }

    public void setCardElim(String cardElim) {
        this.cardElim = cardElim;
    }
}
