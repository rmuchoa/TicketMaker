/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renanmarceluchoa
 */
public class TicketTest {
    
    public TicketTest() {
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

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPreco() {
        System.out.println("calculaPreco");
        Ticket instance = new Ticket(Categoria.CRIANCA, "Domingo", false);
        Double expResult = null;
        Double result = instance.calculaPreco();
        assertEquals(expResult, result);
    }

}