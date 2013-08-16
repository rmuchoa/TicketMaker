package br.com.trevisan.model;

import br.com.trevisan.util.Maths;

public class TicketCrianca extends Ticket {
    
    public TicketCrianca() {
        super();
    }
    
    public TicketCrianca(Dia dia, Boolean feriado) {
        super(dia, feriado);
    }
    
    @Override
    public Double calculaPreco() {
        preco = this.getPrecoPadrao();
        preco -= this.calculaDesconto(preco);
        return Maths.arredondaDuasCasasDecimais(preco);
    }
    
    @Override
    public Double calculaDesconto(Double preco) {
        Double desconto = this.calculaDescontoNoDia(preco);
        Double descontoFeriado = this.calculaDescontoNoFeriado(preco);
        
        if (descontoFeriado > desconto)
            desconto = descontoFeriado;
        
        return desconto;
    }
    
    @Override
    public Double calculaDescontoNoDia(Double preco) {
        Double desconto = 0.0;
        switch (dia) {
            case SEGUNDA :  desconto = preco * 0.1;
                            break;
            case TERCA :    desconto = preco * 0.15;
                            break;
            case QUARTA :   desconto = preco * 0.3;
                            break;
            case SEXTA :    desconto = preco * 0.11;
                            break;
        }
        return desconto;
    }
    
    @Override
    public Double calculaDescontoNoFeriado(Double preco) {
        Double desconto = 0.0;
        return desconto;
    }
    
    @Override
    public Double getPrecoPadrao() {
        if (precoPadrao == null) 
            precoPadrao = 5.5;
        
        return precoPadrao;
    }
    
    @Override
    public void setPrecoPadrao(Double precoPadrao) {
        this.precoPadrao = precoPadrao;
    }
    
    public String toString() {
        return "Criança";
    }
    
}
