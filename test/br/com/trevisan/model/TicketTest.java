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
    
    private static Ticket[] tickets;
    
    public TicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        tickets = new Ticket[] {
            new Ticket(Categoria.CRIANCA,Dia.DOMINGO,false),
            new Ticket(Categoria.CRIANCA,Dia.SEGUNDA,false),
            new Ticket(Categoria.CRIANCA,Dia.TERCA,false),
            new Ticket(Categoria.CRIANCA,Dia.QUARTA,false),
            new Ticket(Categoria.CRIANCA,Dia.QUINTA,false),
            new Ticket(Categoria.CRIANCA,Dia.SEXTA,false),
            new Ticket(Categoria.CRIANCA,Dia.SABADO,false),
            new Ticket(Categoria.ESTUDANTE,Dia.DOMINGO,false),
            new Ticket(Categoria.ESTUDANTE,Dia.SEGUNDA,false),
            new Ticket(Categoria.ESTUDANTE,Dia.TERCA,false),
            new Ticket(Categoria.ESTUDANTE,Dia.QUARTA,false),
            new Ticket(Categoria.ESTUDANTE,Dia.QUINTA,false),
            new Ticket(Categoria.ESTUDANTE,Dia.SEXTA,false),
            new Ticket(Categoria.ESTUDANTE,Dia.SABADO,false),
            new Ticket(Categoria.IDOSO,Dia.DOMINGO,false),
            new Ticket(Categoria.IDOSO,Dia.SEGUNDA,false),
            new Ticket(Categoria.IDOSO,Dia.TERCA,false),
            new Ticket(Categoria.IDOSO,Dia.QUARTA,false),
            new Ticket(Categoria.IDOSO,Dia.QUINTA,false),
            new Ticket(Categoria.IDOSO,Dia.SEXTA,false),
            new Ticket(Categoria.IDOSO,Dia.SABADO,false)
        };
        
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
        Double[] expResult = new Double[] {
            5.5, 4.7, 4.3, 3.1, 5.5, 4.62, 5.5, 8.0, 5.2, 5.2, 4.0, 5.2, 5.2, 8.0, 
            5.7, 5.4, 5.1, 3.6, 4.2, 6.0, 5.7
        };
        for (int i=0; i<tickets.length; i++) {
            Double result = tickets[i].calculaPreco();
            assertEquals(expResult[i], result);
        }
    }

}