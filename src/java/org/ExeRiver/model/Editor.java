/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.model;

/**
 *
 * @author Millie Coombes
 */
import java.util.ArrayList;

public class Editor extends User{
    private ArrayList editorsList;
    //This is a list of booksAssigned
    //The intention here is to source the list by books the editor has been assigned to
    private ArrayList booksAssigned;
    public Subject book;
    public Subject bookRevision;
    public Subject meeting;
    public Subject payment;
    
    public Editor(String personalID, String forename, String surname, String address, String username, String password) {
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    public Editor(){
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
    public ArrayList getEditorsList() {
        return editorsList;
    }

    public void setEditorsList(ArrayList editorsList) {
        this.editorsList = editorsList;
    }
    public void saveEditor(Editor editor){
       editorsList.add(editor);
    }
    
    
    //These are the methods for adding the editor as an observer
    //to these subjects
    public void assignBook(Subject book){
        //this.book = book;
        book.addObserver(this);
    }
    public void assignBookRevision(Subject bookRevision){
        //this.book = book;
        book.addObserver(this);
    }
    public void assignMeeting(Subject meeting){
        //this.meeting = meeting;
        meeting.addObserver(this);
    }
    public void assignPayment(Subject payment){
        //this.payment = payment;
        payment.addObserver(this);  
    }
    
    
    
    public void addBooksAssigned() {
        booksAssigned = new ArrayList();
        //input when registered to book
        booksAssigned.add("input when registered to book");
        //input when Editor is no longer registered to book
        booksAssigned.remove("input when Editor is no longer registered to book");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    //These override the update methods as stated in the Observer interface
    //When updates happen to the subjects the values passed after the method
    //will be updated in the editor observer.
    
    public void createEditor() {
        Editor editorOne = new Editor();
        editorOne.printEditorDetails();
    }

    public void printEditorDetails() {
        System.out.println("Editor name is: " + forename + " " + surname);
        System.out.println("Editor address is: " + address);
        System.out.println("Editor password is: " + password + " ...Sshhh");
    }
    
    @Override
    public void agreeFinalManuscript() {
        //If editor agrees submission of manuscript
        //the particular revision will be marked as final
        /*
        public void getBookManuscriptStatus(Boolean manuscriptAgreed) {
		this.manusciptAgreed = manuscriptAgreed;
		notifyBookObservers();
    }
  
	public int getManuscript() {
		return manuscript;
	}
        get Book.manuscriptAgreed;
        set Book.manuscriptAgreed(true);
    */
    }
            
}
