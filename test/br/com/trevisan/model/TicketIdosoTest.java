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
public class TicketIdosoTest {
    
    private TicketIdoso ticket;
    
    public TicketIdosoTest() {
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
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso na segunda-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSegunda");
        ticket = new TicketIdoso(Dia.SEGUNDA, false);
        Double resultadoEsperado = 5.4;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso na terça-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaTerca");
        ticket = new TicketIdoso(Dia.TERCA, false);
        Double resultadoEsperado = 5.1;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso na quarta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuarta");
        ticket = new TicketIdoso(Dia.QUARTA, false);
        Double resultadoEsperado = 3.6;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso na quinta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuinta");
        ticket = new TicketIdoso(Dia.QUINTA, false);
        Double resultadoEsperado = 4.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso na sexta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSexta");
        ticket = new TicketIdoso(Dia.SEXTA, false);
        Double resultadoEsperado = 6.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso no sábado
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSabado");
        ticket = new TicketIdoso(Dia.SABADO, false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso no domingo
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNoDomingo");
        ticket = new TicketIdoso(Dia.DOMINGO, false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um idoso num feriado de sexta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaIdososNaSextaFeriado() {
        
        System.out.println("calculaPrecoDoIngressoParaIdososNaSextaFeriado");
        ticket = new TicketIdoso(Dia.SEXTA, true);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }
    
}