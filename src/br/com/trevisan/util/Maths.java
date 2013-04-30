/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trevisan.util;

/**
 *
 * @author renanmarceluchoa
 */
public class Maths {
    
    public static Double arredondaDuasCasasDecimais(Double valor) {
        double arredondado = Math.round(valor * 100.0) / 100.0;
        return arredondado;
    }
    
}
