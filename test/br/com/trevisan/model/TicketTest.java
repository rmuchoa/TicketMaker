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
    public void testCalculaPrecoDoIngressoParaCriancasNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSegunda");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.SEGUNDA,false);
        Double resultadoEsperado = 4.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaTerca");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.TERCA,false);
        Double resultadoEsperado = 4.3;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuarta");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.QUARTA,false);
        Double resultadoEsperado = 3.1;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuinta");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.QUINTA,false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSexta");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.SEXTA,false);
        Double resultadoEsperado = 4.62;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNoSabado");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.SABADO,false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNoDomingo");
        Ticket ticket = new Ticket(Categoria.CRIANCA,Dia.DOMINGO,false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSegunda");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.SEGUNDA,false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaTerca");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.TERCA,false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuarta");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.QUARTA,false);
        Double resultadoEsperado = 4.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuinta");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.QUINTA,false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSexta");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.SEXTA,false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoSabado");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.SABADO,false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoDomingo");
        Ticket ticket = new Ticket(Categoria.ESTUDANTE,Dia.DOMINGO,false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSegunda");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.SEGUNDA,false);
        Double resultadoEsperado = 5.4;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaTerca");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.TERCA,false);
        Double resultadoEsperado = 5.1;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuarta");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.QUARTA,false);
        Double resultadoEsperado = 3.6;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuinta");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.QUINTA,false);
        Double resultadoEsperado = 4.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSexta");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.SEXTA,false);
        Double resultadoEsperado = 6.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSabado");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.SABADO,false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNoDomingo");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.DOMINGO,false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Test of calculaPreço method, of class Ticket.
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSextaFeriado() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSextaFeriado");
        Ticket ticket = new Ticket(Categoria.IDOSO,Dia.SEXTA,true);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

}