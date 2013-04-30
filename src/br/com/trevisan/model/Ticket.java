/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.model;

/**
 *
 * @author renanmarceluchoa
 */
public abstract class Ticket {
    
    public static final Double PRECO_CRIANCA = 5.5;
    public static final Double PRECO_ESTUDANTE = 8.0;
    public static final Double PRECO_IDOSO = 6.0;
    
    protected Dia dia;
    protected Boolean feriado;
    protected Double preco;
    
    public Ticket() {
    
    }
    
    public Ticket(Dia dia, Boolean feriado, Double preco) {
        this.dia = dia;
        this.feriado = feriado;
        this.preco = preco;
    }
    
    public abstract Double calculaPreco();
    public abstract Double calculaDesconto(Double preco);
    public abstract Double calculaDescontoNoDia(Double preco);
    public abstract Double calculaDescontoNoFeriado(Double preco);

    /**
     * @return the dia
     */
    public Dia getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Dia dia) {
        this.dia = dia;
    }

    /**
     * @return the feriado
     */
    public Boolean getFeriado() {
        return feriado;
    }

    /**
     * @param feriado the feriado to set
     */
    public void setFeriado(Boolean feriado) {
        this.feriado = feriado;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
