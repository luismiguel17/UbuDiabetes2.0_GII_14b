package com.example.mario.gii_14b.tests;

import com.tfg_gii14b.mario.calculos.CalculaBolo;
import com.tfg_gii14b.mario.persistencia.ValoresPOJO;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class calculaBoloTest {

    //Instanciamos un objeto de tipo ValoresPojo
    ValoresPOJO valoresP;
    //Instanciamos un onjeto de tipo CalculaBolo
    CalculaBolo calculadorBolo;
    double udsInsulina;
    @Test
    public void addition_isCorrect() throws Exception {
        valoresP = new ValoresPOJO(false,20.0,22.0,90.0,120.0,120.0);
        calculadorBolo = new CalculaBolo(valoresP,38);
        udsInsulina = calculadorBolo.calculoBoloCorrector();


    }
}