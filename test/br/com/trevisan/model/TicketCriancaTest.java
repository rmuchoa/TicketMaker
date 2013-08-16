package br.com.trevisan.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNaSegunda() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSegunda");
        ticket = new TicketCrianca(Dia.SEGUNDA, false);
        Double resultadoEsperado = 4.95;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNaTerca() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNaTerca");
        ticket = new TicketCrianca(Dia.TERCA, false);
        Double resultadoEsperado = 4.68;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNaQuarta() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuarta");
        ticket = new TicketCrianca(Dia.QUARTA, false);
        Double resultadoEsperado = 3.85;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNaQuinta() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNaQuinta");
        ticket = new TicketCrianca(Dia.QUINTA, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNaSexta() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNaSexta");
        ticket = new TicketCrianca(Dia.SEXTA, false);
        Double resultadoEsperado = 4.89;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNoSabado() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNoSabado");
        ticket = new TicketCrianca(Dia.SABADO, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaCriancasNoDomingo() {
        System.out.println("calculaPrecoDoIngressoParaCriancasNoDomingo");
        ticket = new TicketCrianca(Dia.DOMINGO, false);
        Double resultadoEsperado = 5.5;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
}