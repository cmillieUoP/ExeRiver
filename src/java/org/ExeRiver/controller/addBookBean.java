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
public class addBookBean {

    private String bookID;
    private String bookTitle;
    private String bookImageRef;
    private String bookAuthorName;
    private String bookAuthorID;
    private String bookAgentID;
    
    
    public addBookBean() {
    }
 
    public String getbookID() {
        return bookID;
    }
 
    public void setbookID(String bookID) {
        this.bookID = bookID;
    }
 
    public String getbookTitle() {
        return bookTitle;
    }
 
    public void setbookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public String getbookImageRef() {
        return bookImageRef;
    }
 
    public void setbookImageRef(String bookImageRef) {
        this.bookImageRef = bookImageRef;
    }
    
    public String getbookAuthorName() {
        return bookAuthorName;
    }
 
    public void setbookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }
    
    public String getbookAuthorID() {
        return bookAuthorID;
    }
 
    public void setbookAuthorID(String bookAuthorID) {
        this.bookAuthorID = bookAuthorID;
    }
    
    public String getbookAgentID() {
        return bookAgentID;
    }
 
    public void setbookAgentID(String bookAgentID) {
        this.bookAgentID = bookAgentID;
    }
 
    public void addBook(){
        
    }
}