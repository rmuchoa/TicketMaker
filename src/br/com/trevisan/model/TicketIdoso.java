/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.model;

import br.com.trevisan.util.Maths;

/**
 *
 * @author renanmarceluchoa
 */
public class TicketIdoso extends Ticket {
    
    public TicketIdoso() {
        super();
    }
    
    public TicketIdoso(Dia dia, Boolean feriado) {
        super(dia, feriado);
    }
    
    /**
     * Calcula o preço do ingresso para o idoso.
     * 
     * @return preco
     */
    @Override
    public Double calculaPreco() {
        
        preco -= this.calculaDesconto(this.getPrecoPadrao());
        return Maths.arredondaDuasCasasDecimais(preco);
        
    }
    
    /**
     * Calcula um desconto para o idoso em cima do valor informado.
     * 
     * @param preco
     * @return desconto
     */
    @Override
    public Double calculaDesconto(Double preco) {
        
        Double desconto = this.calculaDescontoNoDia(preco);
        Double descontoFeriado = this.calculaDescontoNoFeriado(preco);
        
        if (descontoFeriado > desconto)
            desconto = descontoFeriado;
        
        return desconto;
        
    }
    
    /**
     * Calcula o desconto para o idoso com base no dia registrado.
     * 
     * @param preco
     * @return desconto
     */
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
    
    /**
     * Calcula o disconto para o idoso se for um dia de feriado.
     * 
     * @param preco
     * @return desconto
     */
    @Override
    public Double calculaDescontoNoFeriado(Double preco) {
        
        Double desconto = 0.0;
        if (feriado)
            desconto = preco * 0.05;
        return desconto;
        
    }
    
    /**
     * Retorna o preco padrão do Ticket de Idoso
     * 
     * @return precoPadrao
     */
    @Override
    public Double getPrecoPadrao() {
        
        if (precoPadrao == null) 
            precoPadrao = 6.0;
        return precoPadrao;
        
    }
    
    /**
     * Altera o preco padrão do Ticket de Idoso
     * 
     * @param precoPadrao 
     */
    @Override
    public void setPrecoPadrao(Double precoPadrao) {
        
        this.precoPadrao = precoPadrao;
        
    }
    
    /**
     * Retorna o tipo do Ticket
     * 
     * @return 
     */
    public String toString() {
        return "Idoso";
    }
    
}
