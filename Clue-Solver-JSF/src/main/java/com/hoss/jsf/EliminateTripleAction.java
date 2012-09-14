/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoss.jsf;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;
import service.ServerService;

/**
 *
 * @author chostrander
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
@ManagedBean(name = "tripleAction")
@SessionScoped
public class EliminateTripleAction implements Serializable {

    @ManagedProperty(value = "")
    private String room;
    @ManagedProperty(value = "")
    private String suspect;
    @ManagedProperty(value = "")
    private String weapon;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String doTripleElimination() {
        System.out.println("triple selectd: " + this.weapon + "/" + this.room + "/" + this.suspect);

        final Client client = new Client(Protocol.HTTP);
        
        final Reference reference = new Reference("http://localhost/clue/triples");
        reference.setHostPort(ServerService.getPort());
        final Request request = new Request(Method.PUT, reference);
        request.setChallengeResponse(ServerService.getChallengeResponse());

        final Weapon weapon = WeaponEnum.valueOf(this.weapon).getWeapon();
        final Suspect suspect = SuspectEnum.valueOf(this.suspect).getSuspect();
        final Room room = RoomEnum.valueOf(this.room).getRoom();

        request.setEntity(new JacksonRepresentation<Triple>(new Triple(room, suspect, weapon)));
        System.out.println(request.getEntityAsText());
        client.handle(request);
        return "main";
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
}
