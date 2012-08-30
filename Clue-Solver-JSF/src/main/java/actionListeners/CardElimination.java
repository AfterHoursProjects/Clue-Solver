/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListeners;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author chostrander
 */
@ManagedBean (name = "cardElimination")
@RequestScoped
public class CardElimination {
    
    public String eliminateCard(String value) {
        System.out.println("you are here!");
        return "main";
    }
    
}
