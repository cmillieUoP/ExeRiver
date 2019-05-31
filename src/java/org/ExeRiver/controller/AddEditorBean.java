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
import org.ExeRiver.model.Editor;
/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddEditorBean")
@SessionScoped
public class AddEditorBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private Editor editor = new Editor();
    private ArrayList<Editor> editorsList;

    
    @PostConstruct
    public void init() {
        editorsList = new ArrayList<>();
        //Creates preset editor entries
        editor = new Editor("E0001", "Laura", "Phillips", "15 Circle Way, Caldecott", "LPhillips", "IReadBooks");
        editorsList.add(editor);
        editor = new Editor("E0002", "Aidan", "Newton", "86 Tonbridge Road, Copford Green", "ANewton", "IEditBooks");
        editorsList.add(editor);
        
        editor = new Editor();
        //Saves entry to the model list
        editor.setEditorsList((ArrayList<Editor>) editorsList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    public AddEditorBean() {
    }
    
    public void addEditor(){
        editor = new Editor();
        editor = new Editor(this.personalID,this.forename, this.surname, this.address, this.username, this.password);
        editorsList.add(editor);
        //Saves entry to the model list
        editor.setEditorsList((ArrayList<Editor>) editorsList);
        //Resets the data entry for the next submission
        editor = new Editor();
        resetAdd();
    }
 
    public List<Editor> getEditorsList() {
         return editorsList;
    }
    public void resetAdd()
    {
        editor = new Editor();
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

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }
}
