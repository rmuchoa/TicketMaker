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
    
    private static Ticket ticket;
    
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