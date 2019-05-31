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
    private ArrayList agentsList;
    //This is a list of authorsRepresenting
    //The intention here is to source the list by authors the agent has been assigned to
    private ArrayList authorsRepresenting;
    
    public void addAuthorsRepresenting() {
        authorsRepresenting = new ArrayList();
        authorsRepresenting.add(" ");
        //input when registered to book
        authorsRepresenting.remove(" ");
        //input when PR is no longer registered to book
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    public Agent(String personalID, String forename, String surname, String address, String username, String password) {
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    public Agent(){
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
    public ArrayList getAgentsList() {
        return agentsList;
    }

    public void setAgentsList(ArrayList agentsList) {
        this.agentsList = agentsList;
    }
    public void saveAgent(Agent agent){
       agentsList.add(agent);
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
        public void updatePaymentDetails(double amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){

        }
        
    public void createAgent() {
        Agent agentOne = new Agent();
        agentOne.printAgentDetails();
    }

    public void printAgentDetails() {
        System.out.println("Agent name is: " + forename + " " + surname);
        System.out.println("Agent address is: " + address);
        System.out.println("Agent password is: " + password + " ...Sshhh");
    }
        
    
}
