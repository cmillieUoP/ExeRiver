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

public class Agent extends User{
       
    //This is a list of authorsRepresenting
    //The intention here is to source the list by authors the agent has been assigned to
    private ArrayList authorsRepresenting;
    public void addAuthorsRepresenting() {
        authorsRepresenting = new ArrayList();
        authorsRepresenting.add("roger");
        //input when registered to book
        authorsRepresenting.remove("roger");
        //input when PR is no longer registered to book
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    public Agent() {
        
    }
    //These are the methods for adding the agent as an observer
    //to these subjects
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
    //will be updated in the agent observer.
        @Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updatePaymentDetails(float amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){

        }
        
        public void createAgent() {
        Agent agentOne = new Agent();
        agentOne.personalID = "AG0001";
        agentOne.forename = "Adrian";
        agentOne.surname = "Gent";
        agentOne.address = "42 Walberry Road, Umlin";
        agentOne.username = "AGent";
        agentOne.password = "WriteMeABook";
        agentOne.printAgentDetails();
        }
        
        public void printAgentDetails(){
            System.out.println("Agent name is: " + forename + " " + surname);
            System.out.println("Agent address is: " + address);
            System.out.println("Agent password is: " + password + " ...Sshhh");
        }
}
