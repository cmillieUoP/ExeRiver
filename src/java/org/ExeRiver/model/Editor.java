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
    //This is a list of booksAssigned
    //The intention here is to source the list by books the editor has been assigned to
    private ArrayList booksAssigned;
    public Subject book;
    public Subject bookRevision;
    public Subject meeting;
    public Subject payment;
    
    public Editor(){
      
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
        editorOne.personalID = "AU0001";
        editorOne.forename = "Laura";
        editorOne.surname = "Phillips";
        editorOne.address = "15 Circle Way, Caldecott";
        editorOne.username = "LPhillips";
        editorOne.password = "IReadBooks";
        editorOne.printEditorDetails();
        }
        public void printEditorDetails(){
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
		this.manusciptAgreed = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
    }
  
	public int getBPM() {
		return bpm;
	}
        get Book.manuscriptAgreed;
        set Book.manuscriptAgreed(true);
    */
    }
            
}
