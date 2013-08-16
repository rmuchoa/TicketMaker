package br.com.trevisan.model;

import br.com.trevisan.util.Maths;

public class TicketEstudante extends Ticket {
    
    public TicketEstudante() {
        super();
    }
    
    public TicketEstudante(Dia dia, Boolean feriado) {
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
        Double descontoEstudante = this.calculaDescontoEstudante(preco);
        
        if (descontoFeriado > desconto)
            desconto = descontoFeriado;
        
        if (descontoEstudante > desconto)
            desconto = descontoEstudante;
        
        return desconto;
    }
    
    @Override
    public Double calculaDescontoNoDia(Double preco) {
        Double desconto = 0.0;
        switch (dia) {
            case SEGUNDA :  desconto = preco * 0.1;
                            break;
            case TERCA :    desconto = preco * 0.05;
                            break;
            case QUARTA :   desconto = preco * 0.5;
                            break;
            case QUINTA :   desconto = preco * 0.3;
                            break;
        }
        return desconto;
    }
    
    @Override
    public Double calculaDescontoNoFeriado(Double preco) {
        Double desconto = 0.0;
        return desconto;
    }
    
    public Double calculaDescontoEstudante(Double preco) {
        Double desconto = 0.0;
        if (dia != Dia.SABADO && dia != Dia.DOMINGO)
            desconto = preco * 0.35;
        return desconto;
    }
    
    @Override
    public Double getPrecoPadrao() {
        if (precoPadrao == null) 
            precoPadrao = 8.0;
        return precoPadrao;
    }
    
    @Override
    public void setPrecoPadrao(Double precoPadrao) {
        this.precoPadrao = precoPadrao;
    }
    
    public String toString() {
        return "Estudante";
    }
    
}
