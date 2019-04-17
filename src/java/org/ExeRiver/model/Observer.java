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

public interface Observer {
    
    
    //method to update the observer, used by subject
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed);
        public void updateBookRevisionDetails(String editorComments, String manuscript);
        public void updatePaymentDetails(float amount, boolean complete);
        public void updateMeetingDetails(String meetingNotes);
}
