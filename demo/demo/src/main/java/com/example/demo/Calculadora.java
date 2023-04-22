package com.example.demo;
import static org.junit.Assert.assertEquals;

public class Calculadora {

    public String suma(String sumandos) throws Exception {
if (sumandos!= null & sumandos.equals("")){
    return "0";
}
else{
    String[] x;
    int suma=0;
    x=sumandos.split(",");
    for (int i=0;i<x.length;i++){

        if (Integer.parseInt(x[i])<=1000){
            suma=suma+ Integer.parseInt(x[i]);
        }
        if (Integer.parseInt(x[i])<=0){
            throw new Exception("numero negativo");
        }

    }

    return Integer.toString(suma);
}

    }



    public String resta(String sumandos){
        if (sumandos!= null & sumandos.equals("")){
            return "0";
        }
        else{
            String[] x;
            int resta=0;
            x=sumandos.split(",");
            for (int i=0;i<x.length;i++){
                resta=resta- Integer.parseInt(x[i]);
            }
if ( resta < 0){
            return null;}
else {return Integer.toString( resta);}
        }





}}
