/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Push;

import javax.faces.application.FacesMessage;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;

/**
 *
 * @author juan
 */

@PushEndpoint("/admin")
public class Push {

    /**
     * path encargado de recibir todas las notificaciones de insersion, edicion o eliminacion de las otras tablas que consuman dichos metodos
     * @param message
     * @return
     */
    @OnMessage(encoders = {JSONEncoder.class})
    
    public FacesMessage onMessage(FacesMessage message){
        return message;
    }
}
