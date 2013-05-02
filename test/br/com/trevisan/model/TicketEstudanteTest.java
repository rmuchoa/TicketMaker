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
public class TicketEstudanteTest {
    
    private TicketEstudante ticket;
    
    public TicketEstudanteTest() {
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
     * Calcula o preço de um Ingresso para um estudante na segunda-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaSegunda() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSegunda");
        ticket = new TicketEstudante(Dia.SEGUNDA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante na terça-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaTerca() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaTerca");
        ticket = new TicketEstudante(Dia.TERCA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante na quarta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaQuarta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuarta");
        ticket = new TicketEstudante(Dia.QUARTA, false);
        Double resultadoEsperado = 4.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante na quinta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaQuinta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuinta");
        ticket = new TicketEstudante(Dia.QUINTA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante na sexta-feira
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNaSexta() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSexta");
        ticket = new TicketEstudante(Dia.SEXTA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante no sábado
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNoSabado() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoSabado");
        ticket = new TicketEstudante(Dia.SABADO, false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Teste do método calculaPreço da classe Ticket.
     * Calcula o preço de um Ingresso para um estudante no domingo
     */
    @Test
    public void testCalculaPrecoDoIngressoParaEstudantesNoDomingo() {
        
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoDomingo");
        ticket = new TicketEstudante(Dia.DOMINGO, false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
        
    }
    
}