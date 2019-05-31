/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.ExeRiver.model.ProfessionalReviewer;
/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddProfReviewerBean")
@SessionScoped
public class AddProfReviewerBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private ProfessionalReviewer profReviewer = new ProfessionalReviewer();
    private ArrayList<ProfessionalReviewer> profReviewersList; 
    
    @PostConstruct
    public void init() {
        profReviewersList = new ArrayList<>();
        //Creates preset profReviewer entries
        profReviewer =new ProfessionalReviewer("AG0001", "Adrian", "Gent", "42 Walberry Road, Umlin", "AGent", "WriteMeABook");
        profReviewersList.add(profReviewer);
        
        profReviewer = new ProfessionalReviewer();
        profReviewer = new ProfessionalReviewer("AG0002", "Richard", "Atkins", "101 Smith Road, Umlin", "RAtkins", "SellMeAStory");
        profReviewersList.add(profReviewer);
        
        profReviewer = new ProfessionalReviewer();
        profReviewer = new ProfessionalReviewer("AG0003", "Samantha", "White", "144 Front Street, Henley", "SWhite", "TellMeATale");
        profReviewersList.add(profReviewer);
        
        profReviewer = new ProfessionalReviewer();
        profReviewer = new ProfessionalReviewer("AG0004", "Matilda", "Robson", "12 St Denys Road, Praze-an-beeble", "MRobson", "NoteMeANovel");
        profReviewersList.add(profReviewer);
        
        profReviewer = new ProfessionalReviewer();
        //Saves entry to the model list
        profReviewer.setProfReviewersList((ArrayList<ProfessionalReviewer>) profReviewersList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    
    public AddProfReviewerBean() {
    }

    public void addProfReviewer(){
        profReviewer = new ProfessionalReviewer();
        profReviewer = new ProfessionalReviewer(this.personalID,this.forename, this.surname, this.address, this.username, this.password);
        profReviewersList.add(profReviewer);
        //Saves entry to the model list
        profReviewer.setProfReviewersList((ArrayList<ProfessionalReviewer>) profReviewersList);
        //Resets the data entry for the next submission
        profReviewer = new ProfessionalReviewer();
        resetAdd();
    }
 
    public List<ProfessionalReviewer> getProfessionalReviewersList() {
         return profReviewersList;
    }
    public void resetAdd()
    {
        profReviewer = new ProfessionalReviewer();
    }
    //Gets and Sets
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
    
}
