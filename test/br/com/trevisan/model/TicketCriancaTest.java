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
public class TicketCriancaTest {
    
    private TicketCrianca ticket;
    
    public TicketCriancaTest() {
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
     * Calcula o preço de um Ingresso para uma criança na segunda-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSegunda");
        ticket = new TicketCrianca(Dia.SEGUNDA, false);
        Double resultadoEsperado = 4.95;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança na terça-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaTerca");
        ticket = new TicketCrianca(Dia.TERCA, false);
        Double resultadoEsperado = 4.68;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança na quarta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuarta");
        ticket = new TicketCrianca(Dia.QUARTA, false);
        Double resultadoEsperado = 3.85;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança na quinta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuinta");
        ticket = new TicketCrianca(Dia.QUINTA, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança na sexta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSexta");
        ticket = new TicketCrianca(Dia.SEXTA, false);
        Double resultadoEsperado = 4.89;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança no sábado
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNoSabado");
        ticket = new TicketCrianca(Dia.SABADO, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para uma criança no domingo
     */
    @Test
    public void testCalculaPrecoDoIngressoParaCriancasNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaCriancasNoDomingo");
        ticket = new TicketCrianca(Dia.DOMINGO, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }
    
}