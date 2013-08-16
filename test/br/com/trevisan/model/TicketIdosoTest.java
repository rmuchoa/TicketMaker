package br.com.trevisan.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaSegunda() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaSegunda");
        ticket = new TicketIdoso(Dia.SEGUNDA, false);
        Double resultadoEsperado = 5.4;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaTerca() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaTerca");
        ticket = new TicketIdoso(Dia.TERCA, false);
        Double resultadoEsperado = 5.1;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaQuarta() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuarta");
        ticket = new TicketIdoso(Dia.QUARTA, false);
        Double resultadoEsperado = 3.6;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaQuinta() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaQuinta");
        ticket = new TicketIdoso(Dia.QUINTA, false);
        Double resultadoEsperado = 4.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaSexta() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaSexta");
        ticket = new TicketIdoso(Dia.SEXTA, false);
        Double resultadoEsperado = 6.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNoSabado() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaSabado");
        ticket = new TicketIdoso(Dia.SABADO, false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNoDomingo() {
        System.out.println("calculaPrecoDoIngressoParaIdososNoDomingo");
        ticket = new TicketIdoso(Dia.DOMINGO, false);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaIdososNaSextaFeriado() {
        System.out.println("calculaPrecoDoIngressoParaIdososNaSextaFeriado");
        ticket = new TicketIdoso(Dia.SEXTA, true);
        Double resultadoEsperado = 5.7;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
}