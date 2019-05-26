/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean
@RequestScoped
public class AddUserBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
   
    
    public AddUserBean() {
    }
    
   public String getAgentPersonalID() {
        return personalID;
    }
 
    public void setAgentPersonalID(String personalID) {
        this.personalID = personalID;
    }
    
     public String getAgentForename() {
        return forename;
    }
 
    public void setAgentForename(String forename) {
        this.forename = forename;
    }
    public String getAgentSurname() {
        return surname;
    }
 
   public void setAgentSurname(String surname) {
        this.surname = surname;
    }
    public String getAgentAddress() {
        return address;
    }
 
    public void setAgentAddress(String address) {
        this.address = address;
    }
    public String getAgentPassword() {
        return password;
    }
 
    public void setAgentPassword(String password) {
        this.password = password;
    }
    public String getAgentUsername() {
        return username;
    }
 
    public void setAgentUsername(String username) {
        this.username = username;
    }
    public void addAgent(){
        
    }
}
