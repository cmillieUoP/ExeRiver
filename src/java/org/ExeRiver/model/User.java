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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.*;

public abstract class User implements Observer {
	
    public String personalID;
    public String forename;
    public String surname;
    public String address;
    public String password;
    public String username;
        
    
    //THE FOLLOWING METHODS ARE IMPLEMENTED BY ALL    
    public void login () {}  
    public void viewPaymentInformation(){}
    public void attendMeeting() {
        //Register attendance at meetingID, with personalID,
        //adds to meeting array
    }
    public void viewMeetingNotes(){
        //Use viewFile method to view meetingNotes attribute
    }
    public void readFeedback(){
        //Use viewFile method to view editorCommetns attribute
    }
    public void viewFile(){
        String fileName = "";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

    }
	@Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updateBookRevisionDetails(String editorComments, String manuscript){
            
        }
        @Override
        public void updatePaymentDetails(float amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){
            
        }

    //This method is used by the editor, agent and author
    public void agreeAdvancePayment(){
        
    }
    
    //These methods are used by the editor and professional reviewer
    public void recordComment(){
        //Insert comment from text field in the interface, this will
        //be associated and stored with a particular Book revision
    }
    public void recordRating(){
        //Record rating from a number selection, click 1-5
        //this will be recorded against a book revision
    }
    public void advancePublication() {
        //If the reviewer selects the button to advance
        //the publication the advancePublication attribute in
        //the book will then be set to true
    }
      
    public void recordMeetingNotes() {
        //The meeting notes will be saved from a file
        //or text submission on the meeting interface page
    }
    
    //THIS METHOD IS USED BY THE EDITOR AND THE AUTHOR
    public void agreeFinalManuscript() {
    //If editor agrees submission of manuscript
        //the particular revision will be marked as final
        /*
        public void getBookManuscriptStatus(Boolean manuscriptAgreed) {
		this.manusciptAgreed = MA;
        }
        get Book.manuscriptAgreed;
        set Book.manuscriptAgreed(true);
    */   
    }
    
    //THIS METHOD IS USED ONLY BY THE COMPANY ADMINISTRATOR
    public void createAccount(){
        //Take the details of a person
        //Create an instance of the account
        //Add the details to the account
    }
    
}