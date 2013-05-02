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
public class TicketEstudante extends Ticket {
    
    public TicketEstudante() {
        super();
    }
    
    public TicketEstudante(Dia dia, Boolean feriado) {
        super(dia, feriado);
    }
    
    /**
     * Calcula o preço do ingresso para o estudante.
     * 
     * @return preco
     */
    @Override
    public Double calculaPreco() {
        
        preco = this.getPrecoPadrao();
        preco -= this.calculaDesconto(preco);
        return Maths.arredondaDuasCasasDecimais(preco);
        
    }
    
    /**
     * Calcula um desconto para o estudante em cima do valor informado.
     * 
     * @param preco
     * @return desconto
     */
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
    
    /**
     * Calcula o desconto para o estudante com base no dia registrado.
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
                
            case TERCA :    desconto = preco * 0.05;
                            break;
                
            case QUARTA :   desconto = preco * 0.5;
                            break;
                
            case QUINTA :   desconto = preco * 0.3;
                            break;
        
        }
        
        return desconto;
        
    }
    
    /**
     * Calcula um disconto para o estudante em dias de feriado.
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
     * Calcula um disconto para o estudante desde que não seja sábado ou domingo
     * 
     * @param preco
     * @return desconto
     */
    public Double calculaDescontoEstudante(Double preco) {
        
        Double desconto = 0.0;
        if (dia != Dia.SABADO && dia != Dia.DOMINGO)
            desconto = preco * 0.35;
        return desconto;
        
    }
    
    /**
     * Retorna o preco padrão do Ticket de Estudante
     * 
     * @return precoPadrao
     */
    @Override
    public Double getPrecoPadrao() {
        
        if (precoPadrao == null) 
            precoPadrao = 8.0;
        return precoPadrao;
        
    }
    
    /**
     * Altera o preco padrão do Ticket de Estudante
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
        return "Estudante";
    }
    
}
