/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author juan
 */

@ManagedBean(name = "inter")
@SessionScoped
public class Internacionalizacion {
    private String language = "az";
    /**
     * Creates a new instance of Internacionalizacion
     */
    public Internacionalizacion() {
    }

    /**
     *
     * @return
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     *devuelve el tipo de idioma segun la ubicacion español Colombia
     * @return
     */
    public String actionSpanish(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("es_CO"));
        language = "es";
        return null;
    }
    
    /**
     *devuelve el tipo de idioma segun la ubicacion
     * @return
     */
    public String actionInit(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("az"));
        language = "az";
        return null;
    }
    
    /**
     *devuelve el tipo de idioma segun la ubicacion ingles USA
     * @return
     */
    public String actionEnglish(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en_US"));
        language = "en";
        return null;
    }
}
