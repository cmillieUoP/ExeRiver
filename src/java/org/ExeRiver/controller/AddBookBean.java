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
import javax.faces.bean.SessionScoped;
import org.ExeRiver.model.Book;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean (name= "AddBookBean")
@SessionScoped
public class AddBookBean {

    private String bookID;
    private String bookTitle;
    private String profRID1;
    private String profRID2;
    private String editorID;
    private String authorID;
    private String authorName;
    private String agentID;
    private Book book = new Book();
    private ArrayList<Book> booksList; 
    
    @PostConstruct
    public void init() {
        booksList = new ArrayList<>();
        //Creates preset book entries
        book =new Book("B0001", "James and the Giant Peach", "PR001", "PR002", "E001", "AU001", "Roald Dahl", "AG001");
        booksList.add(book);
        
        book = new Book();
        book = new Book("B0002", "The Twits", "PR001", "PR002", "E001", "AU001", "Roald Dahl", "AG001");
        booksList.add(book);
        
        book = new Book();
        //Saves entry to the model list
        book.setBooksList((ArrayList<Book>) booksList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    
    public AddBookBean() {
    }

    public void addBook(){
        book = new Book();
        book = new Book(this.bookID, this.bookTitle, this.profRID1, this.profRID2, this.editorID, this.authorID, this.authorName, this.agentID);
        booksList.add(book);
        //Saves entry to the model list
        book.setBooksList((ArrayList<Book>) booksList);
        //Resets the data entry for the next submission
        book = new Book();
        resetAdd();
    }
 
    public List<Book> getBooksList() {
         return booksList;
    }
    public void resetAdd()
    {
        book = new Book();
    }

    //Gets and Sets

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getProfRID1() {
        return profRID1;
    }

    public void setProfRID1(String profRID1) {
        this.profRID1 = profRID1;
    }

    public String getProfRID2() {
        return profRID2;
    }

    public void setProfRID2(String profRID2) {
        this.profRID2 = profRID2;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getEditorID() {
        return editorID;
    }

    public void setEditorID(String editorID) {
        this.editorID = editorID;
    }
    
    

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
 
}
