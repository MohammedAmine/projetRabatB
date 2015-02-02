/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.controllers.locale;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

/**
 *
 * @author mohammedamine
 */
@Named("localeChangedManagedBean")
@SessionScoped
public class LocaleChangedManagedBean implements Serializable{
    
    private String newLocale=Locale.FRENCH.toString();

    public String getNewLocale() {
        return newLocale;
    }

    public void setNewLocale(String newLocale) {
        this.newLocale = newLocale;
    }
    
    public void changeLocale(ValueChangeEvent e){
        
        if(e.getNewValue().toString().equalsIgnoreCase(Locale.ENGLISH.toString())){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(Locale.ENGLISH.toString()));
        }
        
        if(e.getNewValue().toString().equalsIgnoreCase(Locale.FRENCH.toString())){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale (Locale.FRENCH.toString()));
        }
        
    }
}