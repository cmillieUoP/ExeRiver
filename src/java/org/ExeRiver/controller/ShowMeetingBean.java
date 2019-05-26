/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import java.util.ArrayList;
import org.ExeRiver.model.Meeting;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "meeting")  
@RequestScoped  
public class ShowMeetingBean {    
public List<Meeting> meetingsList;  
public List<Meeting> getMeetingsList() {    
meetingsList = new ArrayList<>();    
meetingsList.add(new Meeting("ME001", "Blurb Review", "Telephone", "24/05/2019", "Blurb confirmed"));    
meetingsList.add(new Meeting("ME002", "Publishing Review", "F2F", "28/05/2019", "Publishers will have to respond by given date"));    
return meetingsList;  
}    
}  
