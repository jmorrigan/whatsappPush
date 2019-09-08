/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Datos;
import Pojo.Persona;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.lang3.StringEscapeUtils;
import org.primefaces.event.RowEditEvent;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 *
 * @author juan
 */
@ManagedBean(name = "vista1")
@SessionScoped
public class Usuario implements Serializable {
    
   

    @ManagedProperty("#{data}")
    
    private Datos datos = new Datos();
    private Persona persona = new Persona();
    
    /**
     *constructor vacío para instanciar el metodo en otras clases
     */
    public Usuario() {
        
    }

   /**
     *metodo para obtener atributos de la clase
     * @return datos
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     *metodo para enviar datos a la clase
     * @param datos
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    /**
     *metodo para obtener el objeto
     * @return
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     *metodo para enviar el objeto
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     *metodo para insertar la persona al arraylist
     * @param p
     */
    public void agregar(Persona p){
        String n = p.getNombre();
        String a = p.getApellido();
        String c = p.getCorreo();
        int e = p.getEdad();
        String l = p.getFoto();
        
        Persona pe = new Persona(n, a, c, e, l);
        pe.setNombre(n);
        pe.setApellido(a);
        pe.setCorreo(c);
        pe.setEdad(e);
        pe.setFoto(l);
        
        datos.añadir(pe);
    }

    /**
     *metodo para editar, envía push al administrador segun el usuario editado
     * @param event
     */
    public void editarPersona(RowEditEvent event){
        Persona p = (Persona)event.getObject();
        FacesMessage msg = new FacesMessage("EDITADO CORRECTAMENTE", p.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
         String Channel = "";
        
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/admin", new FacesMessage(StringEscapeUtils.escapeHtml3("EDITADO CORRECTAMENTE" + p.getNombre()),StringEscapeUtils.escapeHtml3(p.getNombre())));
  
    }
    
   
}
