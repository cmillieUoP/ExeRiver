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
import org.ExeRiver.model.Author;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "author")  
@RequestScoped  
public class ShowAuthorBean {    
public List<Author> authorsList;  
public List<Author> getAuthorsList() {    
authorsList = new ArrayList<>();    
authorsList.add(new Author("AU0001", "Roald", "Dahl", "83 High Street, Great Missenden", "RDahl", "WillyWonka"));       
authorsList.add(new Author("AU0002", "Daphne", "Du Maurier", "Jamaica Inn, Bolventor, Launceston", "DDMaurier", "MaximDeWinter"));
return authorsList;  
}    
}  
