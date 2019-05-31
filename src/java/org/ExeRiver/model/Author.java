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

public class Author extends User {

private ArrayList authorsList;
public ArrayList booksWritten;
public Subject book;
public Subject bookRevision;
public Subject meeting;
public Subject payment;
        
    //This is the constructor for an author
    public Author(String personalID, String forename, String surname, String address, String username, String password) {
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    public Author(){
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
    public ArrayList getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(ArrayList authorsList) {
        this.authorsList = authorsList;
    }
    public void saveAuthor(Author author){
       authorsList.add(author);
    }
    
    //These are the methods for adding the author as an observer
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
    
    //These override the update methods as stated in the Observer interface
    //When updates happen to the subjects the values passed after the method
    //will be updated in the author observer.
        @Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updateBookRevisionDetails(String editorComments, String manuscript){
            
        }
        @Override
        public void updatePaymentDetails(double amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){
            
        }

        public void createAuthor() {
        Author authorOne = new Author();
        authorOne.printAuthorDetails();
        }
        public void printAuthorDetails(){
            System.out.println("Author name is: " + forename + " " + surname);
            System.out.println("Author address is: " + address);
            System.out.println("Author password is: " + password + " ...Sshhh");
        }
        
        public void addBooksWritten() {
        booksWritten = new ArrayList();
        booksWritten.add("input when registered to book");
        booksWritten.remove("input when PR is no longer registered to book");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
        }
        public void writeBook(){

        }
        public void submitBookRevision(){

        }
        @Override
        public void agreeFinalManuscript() {
        //When the agree button is clicked in the author screen it triggers 
        //a request to the editor to agreeFinalManuscript, when they have both
        //clicked this the manuscriptAgreed boolean value in the book to true
        } 
        
        
        
}