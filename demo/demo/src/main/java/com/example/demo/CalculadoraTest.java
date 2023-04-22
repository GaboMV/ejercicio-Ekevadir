package com.example.demo;
import static org.junit.Assert.*;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
public class CalculadoraTest {
    

        @Rule
        	public ExpectedException exception = ExpectedException.none();
    @Test
    public void siCadenaVaciaRetornaCero() throws Exception {
//1. codigo que falla
        //preparacion
        Calculadora c= new Calculadora();

        //logica
        String resultado =  c.suma("");

        //verificacion o assert
        assertEquals("0", resultado);
    }
    //2. codigo que pase la prueba los mas rapido posible osea que no es optimo, implementacion no optima return 0
//3. refactor, revisar y encontrar mejores formas

    @Test
    public void para2numerosRetornarSuma() throws Exception{

        Calculadora c = new Calculadora();

        assertEquals("5",c.suma("2,3"));
        assertEquals("5",c.suma("2,3"));
        assertEquals("7",c.suma("2,3,2"));

    }
     @Test
     public void para3numerosRetornarSuma()  throws Exception
    {

         Calculadora c = new Calculadora();

            assertEquals("10",c.suma("2,3,5"));


            }
    @Test
     public void IgnorarMayorAMil()  throws Exception


{

         Calculadora c = new Calculadora();

        assertEquals("5",c.suma("2,3,1099"));


            }


@Test
     public void IgnorarNumerosNegativos() throws Exception  {

     Calculadora c = new Calculadora();

   assertEquals("5",c.suma("2,3,1099"));

                                                  }  }
