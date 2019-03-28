package org.lasencinas.numeralesromanos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.lasencinas.numeralesromanos.NumeralesRomanos.NumerosRomanos;
import org.junit.BeforeClass;

public class NumeralesRomanosIT {

    public NumeralesRomanosIT() {
    }
    public static String[] RomanNumerals;
    NumeralesRomanos test;

    @BeforeClass
    public static void CreacionArrayRomanNumeralsSetup() {
        RomanNumerals = new String[13];
        int RomanNumeralsIncluidos = 0;
        for (NumerosRomanos RomanNumeral : NumerosRomanos.values()) {
            RomanNumerals[RomanNumeral.ordinal()] = RomanNumeral.name();
            RomanNumeralsIncluidos += 1;
        }
        assertThat(RomanNumeralsIncluidos).isEqualTo(NumerosRomanos.values().length);
    }
    
    @Before
    public void setUp(){
         test = new NumeralesRomanos();
    }

    @Test
    public void testSomeMethod() {
    }

    @Test
    public void RomanConstructorTest() {
        NumerosRomanos numero = NumerosRomanos.UNO;
        assertThat(numero).isInstanceOf(NumerosRomanos.class);
        assertThat(numero.ordinal()).isEqualTo(0);
        assertThat(numero.name()).isEqualToIgnoringWhitespace("UNO");
        assertThat(numero.valueOf(numero.name())).isEqualTo(NumerosRomanos.UNO);
        assertThat(numero.compareTo(numero)).isEqualTo(0);
        assertThat(numero.toString()).isEqualToIgnoringWhitespace("UNO");
        assertThat(numero.equals(numero.UNO)).isEqualTo(true);
        assertThat(numero.values()[0]).isEqualTo(numero);

    }

    @Test
    public void traductorTest() {
        NumerosRomanos UNO = NumeralesRomanos.NumerosRomanos.UNO;
        String mil = "M";
        assertEquals(1000, UNO.traductorNumeroRomano(mil));
        String quinientos = "D";
        assertEquals(500, UNO.traductorNumeroRomano(quinientos));
        String cien = "C";
        assertEquals(100, UNO.traductorNumeroRomano(cien));
        String cincuenta = "L";
        assertEquals(50, UNO.traductorNumeroRomano(cincuenta));
        String diez = "X";
        assertEquals(10, UNO.traductorNumeroRomano(diez));
        String cinco = "V";
        assertEquals(5, UNO.traductorNumeroRomano(cinco));
        String cuatro = "IV";
        assertEquals(4, UNO.traductorNumeroRomano(cuatro));
        String nueve = "IX";
        assertEquals(9, UNO.traductorNumeroRomano(nueve));
        String milquinientos = "MD";
        assertEquals(1500, UNO.traductorNumeroRomano(milquinientos));
    }

}
