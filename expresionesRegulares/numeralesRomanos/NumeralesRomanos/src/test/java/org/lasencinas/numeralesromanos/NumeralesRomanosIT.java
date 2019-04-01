package org.lasencinas.numeralesromanos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.lasencinas.numeralesromanos.NumeralesRomanos.numeralesRomanos;
import org.junit.BeforeClass;

public class NumeralesRomanosIT {

    public NumeralesRomanosIT() {
    }
    public static String[] NumeroRomanos;
    NumerosRomanos test;

    @BeforeClass
    public static void CreacionArrayRomanNumeralsSetup() {
        NumeroRomanos = new String[13];
        int acumuladorNumRomanos = 0;
        for (numeralesRomanos RomanNumeral : numeralesRomanos.values()) {
            NumeroRomanos[RomanNumeral.ordinal()] = RomanNumeral.name();
            acumuladorNumRomanos += 1;
        }
        assertThat(acumuladorNumRomanos).isEqualTo(numeralesRomanos.values().length);
    }

    @Test
    public void RomanConstructorTest() {
        numeralesRomanos numero = numeralesRomanos.UNO;
        assertThat(numero).isInstanceOf(numeralesRomanos.class);
        assertThat(numero.ordinal()).isEqualTo(0);
        assertThat(numero.name()).isEqualToIgnoringWhitespace("UNO");
        assertThat(numero.valueOf(numero.name())).isEqualTo(numeralesRomanos.UNO);
        assertThat(numero.compareTo(numero)).isEqualTo(0);
        assertThat(numero.toString()).isEqualToIgnoringWhitespace("UNO");
        assertThat(numero.equals(numero.UNO)).isEqualTo(true);
        assertThat(numero.values()[0]).isEqualTo(numero);

    }

    @Test
    public void calcularNumerosRomanosSumanTest() {
        String mil = "M";
        NumerosRomanos numero = new NumerosRomanos(mil);

        assertEquals(1000, numero.calcularNumerosRomanosSuman());

        String quinientos = "D";
        NumerosRomanos numero1 = new NumerosRomanos(quinientos);
        assertEquals(500, numero1.calcularNumerosRomanosSuman());

        String cien = "C";
        NumerosRomanos numero2 = new NumerosRomanos(cien);
        assertEquals(100, numero2.calcularNumerosRomanosSuman());

        String cincuenta = "L";

        NumerosRomanos numero3 = new NumerosRomanos(cincuenta);
        assertEquals(50, numero3.calcularNumerosRomanosSuman());

        String diez = "X";
        NumerosRomanos numero4 = new NumerosRomanos(diez);
        assertEquals(10, numero4.calcularNumerosRomanosSuman());

        String cinco = "V";
        NumerosRomanos numero5 = new NumerosRomanos(cinco);
        assertEquals(5, numero5.calcularNumerosRomanosSuman());

        String uno = "I";
        NumerosRomanos numero6 = new NumerosRomanos(uno);
        assertEquals(1, numero6.calcularNumerosRomanosSuman());

    }

    @Test
    public void calcularNumerosRomanosSumanTest2() {

        String test1 = "III"; // 3
        NumerosRomanos numero = new NumerosRomanos(test1);
        assertEquals(3, numero.calcularNumerosRomanosSuman());

        String test2 = "MMMDCCCLXXXVIII"; // 3888
        NumerosRomanos numero1 = new NumerosRomanos(test2);
        assertEquals(3888, numero1.calcularNumerosRomanosSuman());

        String test3 = "MMDCCLXXVII";  // 2777
        NumerosRomanos numero2 = new NumerosRomanos(test3);
        assertEquals(2777, numero2.calcularNumerosRomanosSuman());

        String test4 = "MCCCXXV"; // 1325
        NumerosRomanos numero3 = new NumerosRomanos(test4);
        assertEquals(1325, numero3.calcularNumerosRomanosSuman());

    }

    @Test
    public void traductorNumerosRomanosTest() {

        String test1 = "CDXXXIX"; // 439
        NumerosRomanos numero = new NumerosRomanos(test1);

        assertEquals(439, numero.traductorNumerosRomanos());
        String test2 = "CDXLIV"; // 444

        NumerosRomanos numero1 = new NumerosRomanos(test2);
        assertEquals(444, numero1.traductorNumerosRomanos());

        String test3 = "MMMCMLVII"; // 3957
        NumerosRomanos numero2 = new NumerosRomanos(test3);
        assertEquals(3957, numero2.traductorNumerosRomanos());

    }

    @Test
    public void calcularNumRomanosRestanTest() {
        String cuatro = "IV";
        NumerosRomanos numero = new NumerosRomanos(cuatro);
        assertEquals(4, numero.calcularNumRomanosRestan());

        String nueve = "IX";
        NumerosRomanos numero1 = new NumerosRomanos(nueve);
        assertEquals(9, numero1.calcularNumRomanosRestan());

        String DiezYnueve = "XIX";
        NumerosRomanos numero2 = new NumerosRomanos(DiezYnueve);
        assertEquals(9, numero2.calcularNumRomanosRestan());

        String trece = "IVIX";
        NumerosRomanos numero3 = new NumerosRomanos(trece);
        assertEquals(13, numero3.calcularNumRomanosRestan());

        String ocho = "IVIV";
        NumerosRomanos numero4 = new NumerosRomanos(ocho);
        assertEquals(0, numero4.traductorNumerosRomanos());

        String cuatroCuarentaNueve = "CDXLIX";
        NumerosRomanos numero5 = new NumerosRomanos(cuatroCuarentaNueve);
        assertEquals(449, numero5.calcularNumRomanosRestan());

        String novecientoNoventaCinco = "CMXCV";
        NumerosRomanos numero6 = new NumerosRomanos(novecientoNoventaCinco);
        assertEquals(990, numero6.calcularNumRomanosRestan());

        String trescientosCuarentaNueve = "CCCXLIX";
        NumerosRomanos numero7 = new NumerosRomanos(trescientosCuarentaNueve);
        assertEquals(49, numero7.calcularNumRomanosRestan());

    }

    @Test
    public void validadorNumeroRomanosTest() {

        String uno = "M";
        NumerosRomanos numero = new NumerosRomanos(uno);
        assertEquals(true, numero.validadorNumeroRomanos());

        String dos = "MM";
        NumerosRomanos numero1 = new NumerosRomanos(dos);
        assertEquals(true, numero1.validadorNumeroRomanos());

        String tres = "MMM";
        NumerosRomanos numero2 = new NumerosRomanos(tres);
        assertEquals(true, numero2.validadorNumeroRomanos());

        String cuatro = "MMMM";
        NumerosRomanos numero3 = new NumerosRomanos(cuatro);
        assertEquals(false, numero3.validadorNumeroRomanos());

        String emes = "MMMMMM";
        NumerosRomanos numero4 = new NumerosRomanos(emes);
        assertEquals(false, numero4.validadorNumeroRomanos());

        String test1 = "C";
        NumerosRomanos numero5 = new NumerosRomanos(test1);
        assertEquals(true, numero5.validadorNumeroRomanos());

        String test2 = "CCC";
        NumerosRomanos numero6 = new NumerosRomanos(test2);
        assertEquals(true, numero6.validadorNumeroRomanos());

        String test3 = "CC";
        NumerosRomanos numero7 = new NumerosRomanos(test3);
        assertEquals(true, numero7.validadorNumeroRomanos());

        String test4 = "D";
        NumerosRomanos numero8 = new NumerosRomanos(test4);
        assertEquals(true, numero8.validadorNumeroRomanos());

        String test5 = "DD";
        NumerosRomanos numero9 = new NumerosRomanos(test5);
        assertEquals(false, numero9.validadorNumeroRomanos());

        String test6 = "CCCC";
        NumerosRomanos numero10 = new NumerosRomanos(test6);
        assertEquals(false, numero10.validadorNumeroRomanos());

        String test7 = "L";
        NumerosRomanos numero11 = new NumerosRomanos(test7);
        assertEquals(true, numero11.validadorNumeroRomanos());

        String test8 = "VV";
        NumerosRomanos numero12 = new NumerosRomanos(test8);
        assertEquals(false, numero12.validadorNumeroRomanos());

        String test9 = "V";
        NumerosRomanos numero13 = new NumerosRomanos(test9);
        assertEquals(true, numero13.validadorNumeroRomanos());

        String test10 = "MCD";
        NumerosRomanos numero14 = new NumerosRomanos(test10);
        assertEquals(true, numero14.validadorNumeroRomanos());

        String test11 = "MCDD";
        NumerosRomanos numero15 = new NumerosRomanos(test11);
        assertEquals(false, numero15.validadorNumeroRomanos());

        String test12 = "MCMCD";
        NumerosRomanos numero16 = new NumerosRomanos(test12);
        assertEquals(false, numero16.validadorNumeroRomanos());

        String test13 = "MCMX";
        NumerosRomanos numero17 = new NumerosRomanos(test13);
        assertEquals(true, numero17.validadorNumeroRomanos());

        String test14 = "X";
        NumerosRomanos numero18 = new NumerosRomanos(test14);
        assertEquals(true, numero18.validadorNumeroRomanos());

        String test15 = "MCMXC";
        NumerosRomanos numero19 = new NumerosRomanos(test15);
        assertEquals(true, numero19.validadorNumeroRomanos());

        String test16 = "XCCC";
        NumerosRomanos numero20 = new NumerosRomanos(test16);
        assertEquals(false, numero20.validadorNumeroRomanos());

        String test17 = "XLXL";
        NumerosRomanos numero21 = new NumerosRomanos(test17);
        assertEquals(false, numero21.validadorNumeroRomanos());

        String test18 = "MMCMXL";
        NumerosRomanos numero22 = new NumerosRomanos(test18);
        assertEquals(true, numero22.validadorNumeroRomanos());

        String test19 = "LL";
        NumerosRomanos numero23 = new NumerosRomanos(test19);
        assertEquals(false, numero23.validadorNumeroRomanos());

        String test20 = "L";
        NumerosRomanos numero24 = new NumerosRomanos(test20);
        assertEquals(true, numero24.validadorNumeroRomanos());

        String test21 = "I";
        NumerosRomanos numero25 = new NumerosRomanos(test21);
        assertEquals(true, numero25.validadorNumeroRomanos());

        String test22 = "III";
        NumerosRomanos numero26 = new NumerosRomanos(test22);
        assertEquals(true, numero26.validadorNumeroRomanos());

        String test23 = "IIII";
        NumerosRomanos numero27 = new NumerosRomanos(test23);
        assertEquals(false, numero27.validadorNumeroRomanos());

        String test24 = "IV";
        NumerosRomanos numero28 = new NumerosRomanos(test24);
        assertEquals(true, numero28.validadorNumeroRomanos());

        String test25 = "IX";
        NumerosRomanos numero29 = new NumerosRomanos(test25);
        assertEquals(true, numero29.validadorNumeroRomanos());

        String test26 = "XIMXVI";
        NumerosRomanos numero30 = new NumerosRomanos(test26);
        assertEquals(false, numero30.validadorNumeroRomanos());

        String test27 = "MMMCDLXXXIX";
        NumerosRomanos numero31 = new NumerosRomanos(test27);
        assertEquals(true, numero31.validadorNumeroRomanos());

        String test28 = "CDXLIV";
        NumerosRomanos numero32 = new NumerosRomanos(test28);
        assertEquals(true, numero32.validadorNumeroRomanos());

        String test29 = "MCMLXXXV";
        NumerosRomanos numero33 = new NumerosRomanos(test29);
        assertEquals(true, numero33.validadorNumeroRomanos());

    }
}
