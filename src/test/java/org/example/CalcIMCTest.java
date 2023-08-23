package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcIMCTest {

    CalcIMC pessoa;

    @BeforeEach
    void setUp(){
        pessoa = new CalcIMC();
    }

    @Test
    void deveRetornarExcecaoSexoInvalido(){
        try{
            pessoa.setSexo('a');
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Valor inválido, aceito somente f ou m!", e.getMessage());
        }
    }

    @Test
    void deveRetornarFemininoAbaixoPeso() {
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('f');
        assertEquals("Abaixo do peso",pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal(){
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('f');
        assertEquals("Peso normal",pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaDoPeso(){
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('f');
        assertEquals("Marginalmente acima do peso",pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoAcimaDoPeso(){
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('f');
        assertEquals("Acima do peso ideal",pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoObeso(){
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('f');
        assertEquals("Obeso",pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso() throws Exception {
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('m');
        assertEquals("Abaixo do peso",pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal(){
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('m');
        assertEquals("Peso normal",pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaDoPeso(){
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('m');
        assertEquals("Marginalmente acima do peso",pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoAcimaDoPeso(){
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('m');
        assertEquals("Acima do peso ideal",pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoObeso(){
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('m');
        assertEquals("Obeso",pessoa.calculaImc());
    }

}