package br.com.trevisan.model;

import br.com.trevisan.util.Maths;

public class TicketIdoso extends Ticket {
    
    public TicketIdoso() {
        super();
    }
    
    public TicketIdoso(Dia dia, Boolean feriado) {
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
            case QUARTA :   desconto = preco * 0.4;
                            break;
            case QUINTA :   desconto = preco * 0.3;
                            break;
            case SABADO : case DOMINGO :
                            desconto = preco * 0.05;
                            break;
        }
        return desconto;
    }
    
    @Override
    public Double calculaDescontoNoFeriado(Double preco) {
        Double desconto = 0.0;
        if (feriado)
            desconto = preco * 0.05;
        return desconto;
    }
    
    @Override
    public Double getPrecoPadrao() {
        if (precoPadrao == null) 
            precoPadrao = 6.0;
        return precoPadrao;
    }
    
    @Override
    public void setPrecoPadrao(Double precoPadrao) {
        this.precoPadrao = precoPadrao;
    }
    
    public String toString() {
        return "Idoso";
    }
    
}
