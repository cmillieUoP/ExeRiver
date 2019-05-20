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
public class addUserBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
   
    
    public addUserBean() {
    }
    
   public String getuserPersonalID() {
        return personalID;
    }
 
    public void setuserPersonalID(String personalID) {
        this.personalID = personalID;
    }
    
     public String getuserForename() {
        return forename;
    }
 
    public void setuserForename(String forename) {
        this.forename = forename;
    }
    public String getuserSurname() {
        return surname;
    }
 
   public void setuseSurname(String surname) {
        this.surname = surname;
    }
    public String getuserAddress() {
        return address;
    }
 
    public void setuserAddress(String address) {
        this.address = address;
    }
    public String getuserPassword() {
        return password;
    }
 
    public void setuserPassword(String password) {
        this.password = password;
    }
    public String getuserUsername() {
        return username;
    }
 
    public void setuserUsername(String username) {
        this.username = username;
    }
    public void addUser(){
        
    }
}
