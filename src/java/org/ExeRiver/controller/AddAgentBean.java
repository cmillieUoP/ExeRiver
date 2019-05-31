/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.ExeRiver.model.Agent;
/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddAgentBean")
@SessionScoped
public class AddAgentBean {

    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private Agent agent = new Agent();
    private ArrayList<Agent> agentsList; 
    
    @PostConstruct
    public void init() {
        agentsList = new ArrayList<Agent>();
        agent =new Agent("AG0001", "Adrian", "Gent", "42 Walberry Road, Umlin", "AGent", "WriteMeABook");
        agentsList.add(agent);
        
        agent = new Agent();
        agent = new Agent("AG0002", "Richard", "Atkins", "101 Smith Road, Umlin", "AGent", "WriteMeABook");
        agentsList.add(agent);
        agent = new Agent();
        agent.setAgentsList((ArrayList<Agent>) agentsList);//save to the model list
        resetAdd();
    }

    public AddAgentBean() {
    }

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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    
    public void addAgent(){
//        agent = new Agent("1", "forename", "surname", "address", "username", "password");
        agent = new Agent();
        agent = new Agent(this.personalID,this.forename, this.surname, this.address, this.username, this.password);
        
        agentsList.add(agent);
        agent.setAgentsList((ArrayList<Agent>) agentsList);//save to the model list
        agent = new Agent();
        resetAdd();
    }
 
    public List<Agent> getAgentsList() {
        //agentsList = new ArrayList<>();
        //agentsList.add(new Agent(agent.personalID, "Adrian", "Gent", "42 Walberry Road, Umlin", "AGent", "WriteMeABook"));
        return agentsList;
    }
    public void resetAdd()
    {
        agent = new Agent();
//        this.password = null;
//        this.username=null;
//        this.forename=null;
//        this.surname=null;
//        this.personalID=null;
//        this.address=null;
//        this.agent = new Agent();
//        agent = new Agent();;
    }
}  
    

