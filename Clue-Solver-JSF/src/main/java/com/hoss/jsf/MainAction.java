package com.hoss.jsf;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIColumn;
import javax.faces.component.html.HtmlCommandButton;
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
public class MainAction {

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

    public HtmlPanelGrid getEliminateCardComponents() {
        UIColumn col1 = new UIColumn();
        UIColumn col2 = new UIColumn();
        UIColumn col3 = new UIColumn();
        HtmlCommandButton hcb;
        for (String data : RoomEnum.getStringValues()) {
            hcb = new HtmlCommandButton();
            hcb.setValue(data);

            col1.getChildren().add(hcb);
        }

        for (String data : SuspectEnum.getStringValues()) {
            hcb = new HtmlCommandButton();
            hcb.setValue(data);

            col2.getChildren().add(hcb);
        }

        for (String data : WeaponEnum.getStringValues()) {
            hcb = new HtmlCommandButton();
            hcb.setValue(data);

            col3.getChildren().add(hcb);
        }
        
        if (this.eliminateCardComponenets == null) {
            this.eliminateCardComponenets = new HtmlPanelGrid();
        }
        this.eliminateCardComponenets.getChildren().add(col1);
        this.eliminateCardComponenets.getChildren().add(col2);
        this.eliminateCardComponenets.getChildren().add(col3);

        return this.eliminateCardComponenets;

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
}
