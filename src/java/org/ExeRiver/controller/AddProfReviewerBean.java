/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.ExeRiver.model.ProfessionalReviewer;
/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddProfReviewerBean")
@RequestScoped
public class AddProfReviewerBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private ProfessionalReviewer profReviewer;

    public AddProfReviewerBean() {
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ProfessionalReviewer getProfReviewer() {
        return profReviewer;
    }

    public void setProfReviewer(ProfessionalReviewer profReviewer) {
        this.profReviewer = profReviewer;
    }
    
    public void addProfReviewer(){
        profReviewer = new ProfessionalReviewer("PR0001", "forename", "surname", "address", "username", "password");
    }
}
