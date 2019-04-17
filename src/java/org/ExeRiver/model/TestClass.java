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
public class TestClass {

    /**
     * @param args the command line arguments
     */
    //private Subject book;
    
    public static void main(String[] args) {
        //Author authorOne = new Author(Book);
        //this.Book = book;
        
        //authorOne.personalID = 00001;
        //authorOne.printAuthorDetails();
        Book bookOne = new Book();
        bookOne.bookID = 00001;
        bookOne.bookTitle = "James and the Giant Peach";
        bookOne.printBookDetails();
        }

}
