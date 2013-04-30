/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.model;

/**
 *
 * @author renanmarceluchoa
 */
public class TicketMaker {
    
    public static void main (String args[]) {
        
        Ticket[] tickets = new Ticket[] {
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
        
        for (Ticket ticket : tickets) {
            System.out.println("Categoria do Ticket: " + ticket.getCategoria().toString());
            System.out.println("Dia: " + ticket.getDia().toString());
            System.out.println("Preço: " + ticket.calculaPreco());
        }
        
    }
    
}
