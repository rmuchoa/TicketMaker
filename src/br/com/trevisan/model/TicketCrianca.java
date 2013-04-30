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
public class TicketCrianca extends Ticket {
    
    public TicketCrianca() {
        super();
    }
    
    public TicketCrianca(Dia dia, Boolean feriado) {
        super(dia, feriado, PRECO_CRIANCA);
    }
    
    /**
     * Calcula o preço do ingresso para a criança.
     * 
     * @return preco
     */
    @Override
    public Double calculaPreco() {
        
        preco -= this.calculaDesconto(preco);
        return Maths.arredondaDuasCasasDecimais(preco);
        
    }
    
    /**
     * Calcula um desconto para a criança em cima do valor informado.
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
     * Calcula o desconto para a criança com base no dia registrado.
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
                
            case QUARTA :   desconto = preco * 0.3;
                            break;
                
            case SEXTA :    desconto = preco * 0.11;
                            break;
        
        }
        
        return desconto;
        
    }
    
    /**
     * Calcula um disconto para a criança em dias de feriado.
     * 
     * @param preco
     * @return desconto
     */
    @Override
    public Double calculaDescontoNoFeriado(Double preco) {
        
        Double desconto = 0.0;
        return desconto;
        
    }
    
    /**
     * Retorna o tipo do Ticket
     * 
     * @return 
     */
    public String toString() {
        return "Criança";
    }
    
}
