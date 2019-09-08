/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Pojo.Persona;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.lang3.StringEscapeUtils;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 *
 * @author juan
 */
@ManagedBean(name = "data")
@SessionScoped
public class Datos implements Serializable {

    private ArrayList<Persona> persona = new ArrayList<>();
    private Persona p = new Persona();
    
    /**
     * Creates a new instance of Datos
     */
    public Datos() {
    }

    /**
     *
     * @return
     */
    public ArrayList<Persona> getPersona() {
        return persona;
    }

    /**
     *
     * @param persona
     */
    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }
    
    /**
     *metodo para insertar la persona en el arraylist recibiendo como parametro el objeto persona, envía push a admin
     * @param p
     */
    public void añadir(Persona p) {
        this.persona.add(p);
        FacesMessage msg = new FacesMessage("AGREGADO CORRECTAMENTE", p.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        String Chanel = "";
        
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/admin", new FacesMessage(StringEscapeUtils.escapeHtml3("SE INSERTO A:"),StringEscapeUtils.escapeHtml3(p.getNombre())));
   
        
    }
    
    /**
     * metodo utilizado para obtener la persona del datatable y eliminarla
     * @param p
     * @throws Exception
     */
    public void eliminar(Persona p) throws Exception{
        this.persona.remove(p);
        FacesMessage msg = new FacesMessage("ELIMINADO CORRECTAMENTE", p.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        String Channel = "";
        
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/admin", new FacesMessage(StringEscapeUtils.escapeHtml3("SE ELIMINO A:"),StringEscapeUtils.escapeHtml3(p.getNombre())));
    }

    /**
     *
     * @return
     */
    public Persona getP() {
        return p;
    }

    /**
     *
     * @param p
     */
    public void setP(Persona p) {
        this.p = p;
    }
    
    
}
