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
    
    protected Dia dia;
    protected Boolean feriado;
    protected Double precoPadrao;
    protected Double preco;
    
    public Ticket() {
    
    }
    
    public Ticket(Dia dia, Boolean feriado) {
        this.dia = dia;
        this.feriado = feriado;
    }
    
    public abstract Double calculaPreco();
    public abstract Double calculaDesconto(Double preco);
    public abstract Double calculaDescontoNoDia(Double preco);
    public abstract Double calculaDescontoNoFeriado(Double preco);
    
    public abstract Double getPrecoPadrao();
    public abstract void setPrecoPadrao(Double precoPadrao);

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Boolean getFeriado() {
        return feriado;
    }

    public void setFeriado(Boolean feriado) {
        this.feriado = feriado;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
