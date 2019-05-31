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
import org.ExeRiver.model.Author;
/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddAuthorBean")
@SessionScoped
public class AddAuthorBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private Author author = new Author();
    private ArrayList<Author> authorsList;

    @PostConstruct
    public void init() {
        authorsList = new ArrayList<>();
        //Creates preset author entries
        author =new Author("AU0001", "Roald", "Dahl", "83 High Street, Great Missenden", "RDahl", "WillyWonka");
        authorsList.add(author);
        
        author = new Author();
        author = new Author("AU0002", "Daphne", "Du Maurier", "Jamaica Inn, Bolventor, Launceston", "DDMaurier", "MaximDeWinter");
        authorsList.add(author);
        
        author = new Author();
        author = new Author("AU0003", "Geoffrey", "Chaucer", "30 Fenchurch Street, London", "GChaucer", "Canterbury");
        authorsList.add(author);
        
        author = new Author();
        //Saves entry to the model list
        author.setAuthorsList((ArrayList<Author>) authorsList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    
    public AddAuthorBean() {
    }
    
     public void addAuthor(){
        author = new Author();
        author = new Author(this.personalID,this.forename, this.surname, this.address, this.username, this.password);
        authorsList.add(author);
        //Saves entry to the model list
        author.setAuthorsList((ArrayList<Author>) authorsList);
        //Resets the data entry for the next submission
        author = new Author();
        resetAdd();
    }
    
    public List<Author> getAuthorsList() {
         return authorsList;
    }
    public void resetAdd()
    {
        author = new Author();
    }

    //Gets and sets
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
