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
    //This is a list of booksReviewed
    //The intention here is to source the list by books the PR has been assigned to
    public ArrayList booksReviewed;
    public Subject book;
    public Subject meeting;
    public Subject payment;
    
    public ProfessionalReviewer(){
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
    public void updatePaymentDetails(float amount, boolean complete){

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
        ProfessionalReviewer PROne = new ProfessionalReviewer();
        PROne.personalID = "PR0001";
        PROne.forename = "Dylan";
        PROne.surname = "Pratt";
        PROne.address = "67 Park Row, Edstone";
        PROne.username = "DPratt";
        PROne.password = "PagesOfBooks";
        PROne.printPRDetails();
        ProfessionalReviewer PRTwo = new ProfessionalReviewer();
        PRTwo.personalID = "PR0002";
        PRTwo.forename = "Emma";
        PRTwo.surname = "Marshall";
        PRTwo.address = "18 Fosse Way, Ardelve";
        PRTwo.username = "EMarshall";
        PRTwo.password = "TreesMakePages";
        PRTwo.printPRDetails();
        }
    public void printPRDetails(){
            System.out.println("Reviewer name is: " + forename + " " + surname);
            System.out.println("Reviewer address is: " + address);
            System.out.println("Reviewer password is: " + password + " ...Sshhh");
        }
    
}
