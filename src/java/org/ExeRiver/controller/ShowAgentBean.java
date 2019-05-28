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
import org.ExeRiver.model.Agent;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "agent")  
@RequestScoped  
public class ShowAgentBean {    
public List<Agent> agentsList;  
public List<Agent> getAgentsList() {    
agentsList = new ArrayList<>();    
agentsList.add(new Agent("AG0001", "Adrian", "Gent", "42 Walberry Road, Umlin", "AGent", "WriteMeABook"));       
return agentsList;  
}    
}  
