package com.tfg_gii14b.mario.calculos;

import com.tfg_gii14b.mario.persistencia.ValoresPOJO;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LuisMiguel on 08/03/2018.
 */
public class CalculaBoloTest {

    //Instanciamos un objeto de tipo ValoresPojo
    ValoresPOJO valoresP;
    //Instanciamos un onjeto de tipo CalculaBolo
    CalculaBolo calculadorBolo;
    double udsInsulina;
    //Obtiene si se usa o no insulina rápida.
    boolean rapida;
    //uds Insulina Basal
    double insulinaBasal;
    //uds Insulina rapida
    double insulinaRapida;
    //uds min Glucemia en la normalidad
    double glucemiaMinima;
    ////uds max Glucemia en la normalidad
    double glucemiaMaxima;
    //lectura actual de glucemia mg/dl
    double glucemia;
    //uds insulina total en 24h
    double insTotal;

    @Test
    public void calculaRatio() throws Exception {
        rapida = false;
        insulinaBasal = 15.0;
        insulinaRapida=15.0;
        glucemiaMinima = 90.0;
        glucemiaMaxima = 150.0;
        glucemia = 80.0;
        valoresP = new ValoresPOJO(rapida,insulinaBasal,insulinaRapida,glucemiaMinima,glucemiaMaxima,glucemia);
        insTotal = insulinaBasal+ insulinaRapida;
        calculadorBolo = new CalculaBolo(valoresP,200);
        //System.out.println("Ratio:" + (float)calculadorBolo.calculaRatio());
        assertEquals((float)(500/(insulinaBasal+insulinaRapida)),(float)calculadorBolo.calculaRatio(),4);

    }

    @Test
    public void calculaFactorSensibilidadRapida() throws Exception {

        rapida = true;
        insulinaBasal = 15.0;
        insulinaRapida= 15.0;
        glucemiaMinima = 90.0;
        glucemiaMaxima = 150.0;
        glucemia = 80.0;
        valoresP = new ValoresPOJO(rapida,insulinaBasal,insulinaRapida,glucemiaMinima,glucemiaMaxima,glucemia);
        insTotal = insulinaBasal+ insulinaRapida;
        calculadorBolo = new CalculaBolo(valoresP,200);
        //System.out.println("FSI:" + (float)calculadorBolo.calculaFactorSensibilidad());
        assertEquals((float)(1800/insTotal),(float)calculadorBolo.calculaFactorSensibilidad(),2);
    }

    @Test
    public void calculaFactorSensibilidadUltraRapida() throws Exception {

        rapida = false;
        insulinaBasal = 15.0;
        insulinaRapida= 15.0;
        glucemiaMinima = 90.0;
        glucemiaMaxima = 150.0;
        glucemia = 80.0;
        valoresP = new ValoresPOJO(rapida,insulinaBasal,insulinaRapida,glucemiaMinima,glucemiaMaxima,glucemia);
        insTotal = insulinaBasal+ insulinaRapida;
        calculadorBolo = new CalculaBolo(valoresP,200);
        //System.out.println("FSI:" + (float)calculadorBolo.calculaFactorSensibilidad());
        assertEquals((float)(1500/insTotal),(float)calculadorBolo.calculaFactorSensibilidad(),2);
    }


    @Test
    public void calculaGlucemiaObjetivo() throws Exception {
        rapida = true;
        insulinaBasal = 15.0;
        insulinaRapida= 15.0;
        glucemiaMinima = 90.0;
        glucemiaMaxima = 150.0;
        glucemia = 80.0;
        valoresP = new ValoresPOJO(rapida,insulinaBasal,insulinaRapida,glucemiaMinima,glucemiaMaxima,glucemia);
        insTotal = insulinaBasal+ insulinaRapida;
        calculadorBolo = new CalculaBolo(valoresP,200);
        System.out.println("GObjetivo:" + (float)calculadorBolo.calculaGlucemiaObjetivo());
        assertEquals((float)((glucemiaMinima+glucemiaMaxima)/2),(float)calculadorBolo.calculaGlucemiaObjetivo(),3);
    }

    @Test
    public void calculoUnidadesInsulina() throws Exception {

    }

        @Test
    public void calculoBoloCorrector() throws Exception {

    }

    /**
    @Test
    public void addition_isCorrect() throws Exception {
        rapida = false;
        insulinaBasal = 15.0;
        insulinaRapida=15.0;
        glucemiaMinima = 90.0;
        glucemiaMaxima = 150.0;
        glucemia = 80.0;
        valoresP = new ValoresPOJO(rapida,insulinaBasal,insulinaRapida,glucemiaMinima,glucemiaMaxima,glucemia);
        calculadorBolo = new CalculaBolo(valoresP,38);
        udsInsulina = calculadorBolo.calculoBoloCorrector();

    }
    */
}