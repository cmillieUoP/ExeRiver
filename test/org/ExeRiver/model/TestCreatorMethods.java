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
import static org.junit.Assert.*;

/**
 *
 * @author Millie Coombes
 */
public class TestCreatorMethods {

    private Subject book;
    
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
        Author authorOne = new Author();
        authorOne.createAuthor();
    }
    
    @Test
    public void testCreateAgent() {
        Agent agentOne = new Agent();
        agentOne.createAgent();
    }
    
    @Test
    public void testCreateEditor() {
        Editor editorOne = new Editor();
        editorOne.createEditor();
    }
    
    @Test
    public void testCreateProfReviewer() {
        ProfessionalReviewer PROne = new ProfessionalReviewer();
        PROne.createProfReviewer();
    }
    
    //Creating Subjects
    @Test
    public void testCreateBook() {
        Book bookOne = new Book();
        bookOne.createBook();
    }
    @Test
    public void testCreateBookRevision() {
        BookRevision bookROne = new BookRevision();
        bookROne.createBookRevision();
    }
    
    @Test
    public void testCreateMeeting() {
        Meeting meetingOne = new Meeting();
        meetingOne.createMeeting();
    }
    
    @Test
    public void testCreatePayment() {
        Payment paymentOne = new Payment();
        paymentOne.createPayment();
    }
}
