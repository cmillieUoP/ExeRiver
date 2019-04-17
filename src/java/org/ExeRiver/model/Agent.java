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
//import java.util.Observer;

public abstract class Agent extends User{
       
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
    
        @Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updatePaymentDetails(float amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){
            
        }
}
