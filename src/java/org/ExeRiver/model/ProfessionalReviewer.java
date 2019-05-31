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

public class ProfessionalReviewer extends User{
    private ArrayList profReviewersList;    
    //This is a list of booksReviewed
    //The intention here is to source the list by books the PR has been assigned to
    public ArrayList booksReviewed;
    public Subject book;
    public Subject meeting;
    public Subject payment;
    
    public ProfessionalReviewer(String personalID, String forename, String surname, String address, String username, String password) {
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    public ProfessionalReviewer(){
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

    public ArrayList getProfReviewersList() {
        return profReviewersList;
    }

    public void setProfReviewersList(ArrayList profReviewersList) {
        this.profReviewersList = profReviewersList;
    }
    
    public void saveAgent(ProfessionalReviewer profReviewer){
       profReviewersList.add(profReviewer);
    }
    //These are the methods for adding the professional
    //reviewer as an observer to these subjects
    public void assignBook(Subject book){
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
    //will be updated in the professional reviewer observer.
    @Override
    public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){

    }
    
    @Override
    public void updatePaymentDetails(double amount, boolean complete){

    }
    @Override
    public void updateMeetingDetails(String meetingNotes){

    }
    
    public void addBooksReviewed() {
        booksReviewed = new ArrayList();
        booksReviewed.add("input when registered to book");
        booksReviewed.remove("input when PR is no longer registered to book");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    
    public void createProfReviewer() {
        ProfessionalReviewer PROne = new ProfessionalReviewer("PR0001","Dylan","Pratt","67 Park Row, Edstone","DPratt","PagesOfBooks");
        PROne.printPRDetails();
        ProfessionalReviewer PRTwo = new ProfessionalReviewer("PR0002","Emma","Marshall","18 Fosse Way, Ardelve","EMarshall","TreesMakePages");
        PRTwo.printPRDetails();
        }
    public void printPRDetails(){
            System.out.println("Reviewer name is: " + forename + " " + surname);
            System.out.println("Reviewer address is: " + address);
            System.out.println("Reviewer password is: " + password + " ...Sshhh");
        }
    
}
