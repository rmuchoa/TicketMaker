/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.model;

/**
 *
 * @author renanmarceluchoa
 */
public class Ticket {
    
    public static final Double PRECO_CRIANCA = 5.5;
    public static final Double PRECO_ESTUDANTE = 8.0;
    public static final Double PRECO_IDOSO = 6.0;
    
    private Categoria categoria;
    private String dia;
    private Boolean feriado;
    private Double preco;
    
    public Ticket(Categoria categoria, String dia, Boolean feriado) {
        this.categoria = categoria;
        this.dia = dia;
        this.feriado = feriado;
    }
    
    /**
     * @return the price
     */
    public Double calculaPreco() {
        return null;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
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
        if (getPreco() == null) {
            this.preco = this.calculaPreco();
        }
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
