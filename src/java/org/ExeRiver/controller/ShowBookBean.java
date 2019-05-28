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
import org.ExeRiver.model.Book;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "book")  
@RequestScoped  
public class ShowBookBean {    
public List<Book> booksList;  
public List<Book> getBooksList() {    
booksList = new ArrayList<>();    
booksList.add(new Book("B0001", "James and the Giant Peach", "PR001", "PR002", "E001", "AU001", "Roald Dahl", "AG001"));    
booksList.add(new Book("B0002", "The Twits", "PR001", "PR002", "E001", "AU001", "Roald Dahl", "AG001"));    
return booksList;  
}    
}  
