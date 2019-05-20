/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean
@RequestScoped
public class addMeetingBean {

    private String meetingNotes;
    private String meetingAttendees;
   
    
    public addMeetingBean() {
    }
 
    public String getmeetingNotes() {
        return meetingNotes;
    }
 
    public void setmeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }
 
    public String getmeetingAttendees() {
        return meetingAttendees;
    }
 
    public void setmeetingAttendees(String meetingAttendees) {
        this.meetingAttendees = meetingAttendees;
    }
    
    
    public void addMeeting(){
        
    }
}
