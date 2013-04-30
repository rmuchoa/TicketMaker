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
    private Dia dia;
    private Boolean feriado;
    private Double preco;
    
    public Ticket() {
    
    }
    
    public Ticket(Dia dia, Boolean feriado) {
        this.dia = dia;
        this.feriado = feriado;
    }
    
    public Ticket(Categoria categoria, Dia dia, Boolean feriado) {
        this.categoria = categoria;
        this.dia = dia;
        this.feriado = feriado;
    }
    
    /**
     * @return the price
     */
    public Double calculaPreco() {
        
        switch(categoria) {
            
            case CRIANCA :      this.preco = PRECO_CRIANCA;
                                this.preco -= this.calculaDesconto(PRECO_ESTUDANTE);
                                break;
                           
            case ESTUDANTE :    this.preco = PRECO_ESTUDANTE;
                                this.preco -= this.calculaDesconto(PRECO_ESTUDANTE);
                                break;
                                
            case IDOSO :        this.preco = PRECO_IDOSO;
                                this.preco -= this.calculaDesconto(PRECO_IDOSO);
                                break;
        
        }
        
        return this.arredondaDuasCasasDecimais(this.preco);
        
    }
    
    public Double calculaDesconto(Double preco) {
        
        Double desconto = this.calculaDescontoDia(preco);
        Double descontoFeriado = this.calculaDescontoFeriado(preco);
        Double descontoEstudante = this.calculaDescontoEstudante(preco);
        
        if (descontoFeriado > desconto)
            desconto = descontoFeriado;
        
        if (descontoEstudante > desconto)
            desconto = descontoEstudante;
        
        return desconto;
        
    }
    
    public Double calculaDescontoDia(Double preco) {
        
        Double desconto = 0.0;
        
        switch (dia) {
        
            case SEGUNDA :
                desconto = preco * 0.1;
                break;
                
            case TERCA :
                if (categoria == Categoria.CRIANCA || categoria == Categoria.IDOSO)
                    desconto = preco * 0.15;
                else if (categoria == Categoria.ESTUDANTE)
                    desconto = preco * 0.05;
                break;
                
            case QUARTA :
                if (categoria == Categoria.CRIANCA)
                    desconto = preco * 0.3;
                else if (categoria == Categoria.ESTUDANTE)
                    desconto = preco * 0.5;
                else if (categoria == Categoria.IDOSO)
                    desconto = preco * 0.4;
                break;
                
            case QUINTA :
                if (categoria == Categoria.IDOSO || categoria == Categoria.ESTUDANTE)
                    desconto = preco *  0.3;
                break;
                
            case SEXTA :
                if (categoria == Categoria.CRIANCA)
                    desconto = preco * 0.11;
                break;
                
            case SABADO : case DOMINGO :
                if (categoria == Categoria.IDOSO)
                    desconto = preco * 0.05;
                break;
        
        }
        
        return desconto;
        
    }
    
    public Double calculaDescontoFeriado(Double preco) {
        Double desconto = 0.0;
        if (feriado && categoria == Categoria.IDOSO)
            desconto = preco * 0.05;
        return desconto;
    }
    
    public Double calculaDescontoEstudante(Double preco) {
        Double desconto = 0.0;
        if (categoria == Categoria.ESTUDANTE && dia != Dia.SABADO && dia != Dia.DOMINGO)
            desconto = preco * 0.35;
        return desconto;
    }
    
    public Double arredondaDuasCasasDecimais(Double valor) {
        double arredondado = Math.round(valor * 100.0) / 100.0;
        return arredondado;
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
        if (this.preco == null) {
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
