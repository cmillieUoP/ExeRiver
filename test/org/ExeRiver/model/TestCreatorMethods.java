/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.model;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Millie Coombes
 */
public class TestCreatorMethods {

    //private Subject book;
    
    public TestCreatorMethods() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Creating observers
    @Test
    public void testCreateAuthor() {
        Author authorOne = new Author("AU0001", "Roald", "Dahl", "83 High Street, Great Missenden", "RDahl", "WillyWonka");
        authorOne.createAuthor();
    }
    
    @Test
    public void testCreateAgent() {
        Agent agentOne = new Agent("AG0001", "Adrian", "Gent", "42 Walberry Road, Umlin", "AGent", "WriteMeABook");
        agentOne.createAgent();
    }
    
    @Test
    public void testCreateEditor() {
        Editor editorOne = new Editor("AU0001","Laura", "Phillips", "15 Circle Way, Caldecott", "LPhillips", "IReadBooks");
        editorOne.createEditor();
    }
    
    @Test
    public void testCreateProfReviewer() {
        ProfessionalReviewer PROne = new ProfessionalReviewer("PR0001","Dylan","Pratt","67 Park Row, Edstone","DPratt","PagesOfBooks");
        PROne.createProfReviewer();
    }
    
    //Creating Subjects
    @Test
    public void testCreateBook() {
        Book bookOne = new Book("B0001", "James and the Giant Peach", "PR001", "PR002", "E001", "AU001", "Roald Dahl", "AG001");
        bookOne.createBook();
    }
    @Test
    public void testCreateBookRevision() {
        BookRevision bookROne = new BookRevision();
        bookROne.createBookRevision();
    }

    @Test
    public void testCreateMeeting() {
        Meeting meetingOne = new Meeting("ME001", "Review of James and the Giant Peach", "Telephone", "01/04/2019", "TBC", "Attendees");
        meetingOne.createMeeting();
    }

    
    @Test
    public void testCreatePayment() {
        Payment paymentOne = new Payment("P001", "E001", "AG001", "AU001", "B0001", 100.00, false);
        paymentOne.createPayment();
    }
}
