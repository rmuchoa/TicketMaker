package br.com.trevisan.util;

public class Maths {
    
    public static Double arredondaDuasCasasDecimais(Double valor) {
        double arredondado = Math.round(valor * 100.0) / 100.0;
        return arredondado;
    }
    
}
