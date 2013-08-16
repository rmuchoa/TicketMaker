package br.com.trevisan;

import br.com.trevisan.model.Dia;
import br.com.trevisan.model.Ticket;
import br.com.trevisan.model.TicketCrianca;
import br.com.trevisan.model.TicketEstudante;
import br.com.trevisan.model.TicketIdoso;

public class TicketMaker {
    
    public static void main (String args[]) {
        
        Ticket[] tickets = new Ticket[] {
            new TicketCrianca(Dia.DOMINGO,false),
            new TicketCrianca(Dia.SEGUNDA,false),
            new TicketCrianca(Dia.TERCA,false),
            new TicketCrianca(Dia.QUARTA,false),
            new TicketCrianca(Dia.QUINTA,false),
            new TicketCrianca(Dia.SEXTA,false),
            new TicketCrianca(Dia.SABADO,false),
            new TicketEstudante(Dia.DOMINGO,false),
            new TicketEstudante(Dia.SEGUNDA,false),
            new TicketEstudante(Dia.TERCA,false),
            new TicketEstudante(Dia.QUARTA,false),
            new TicketEstudante(Dia.QUINTA,false),
            new TicketEstudante(Dia.SEXTA,false),
            new TicketEstudante(Dia.SABADO,false),
            new TicketIdoso(Dia.DOMINGO,false),
            new TicketIdoso(Dia.SEGUNDA,false),
            new TicketIdoso(Dia.TERCA,false),
            new TicketIdoso(Dia.QUARTA,false),
            new TicketIdoso(Dia.QUINTA,false),
            new TicketIdoso(Dia.SEXTA,false),
            new TicketIdoso(Dia.SABADO,false)
        };
        
        for (Ticket ticket : tickets) {
            System.out.println("Ticket: " + ticket.toString());
            System.out.println("Dia: " + ticket.getDia().toString());
            System.out.println("Preço: " + ticket.calculaPreco());
        }
        
    }
    
}
