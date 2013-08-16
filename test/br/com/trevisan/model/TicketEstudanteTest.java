package br.com.trevisan.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNaSegunda() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSegunda");
        ticket = new TicketEstudante(Dia.SEGUNDA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNaTerca() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaTerca");
        ticket = new TicketEstudante(Dia.TERCA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNaQuarta() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuarta");
        ticket = new TicketEstudante(Dia.QUARTA, false);
        Double resultadoEsperado = 4.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNaQuinta() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaQuinta");
        ticket = new TicketEstudante(Dia.QUINTA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNaSexta() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNaSexta");
        ticket = new TicketEstudante(Dia.SEXTA, false);
        Double resultadoEsperado = 5.2;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNoSabado() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoSabado");
        ticket = new TicketEstudante(Dia.SABADO, false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveCalcularPrecoDoIngressoParaEstudantesNoDomingo() {
        System.out.println("calculaPrecoDoIngressoParaEstudantesNoDomingo");
        ticket = new TicketEstudante(Dia.DOMINGO, false);
        Double resultadoEsperado = 8.0;
        Double resultadoObtido = ticket.calculaPreco();
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
}