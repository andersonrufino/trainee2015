package Testes;
import Entidades.Converter

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Judah
 */
public class ConveterTest {

    public ConveterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void insere_I_retorna_1() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "I";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(1, resultado);
    }

    @Test
    public void insere_X_retorna_10() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "X";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(10, resultado);
    }

    @Test
    public void insere_II_retorna_2() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "II";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(2, resultado);
    }

    @Test
    public void insere_IV_retorna_4() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "IV";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(4, resultado);
    }

    @Test
    public void insere_XXX_retorna_30() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(30, resultado);
    }

    @Test(expected = Exception.class)
    public void insere_XXXX_retorna_Exeption() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXXX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        //assertEquals(30, resultado);
    }

    @Test(expected = Exception.class)
    public void insere_VV_retorna_Exeption() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "VV";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        //assertEquals(10, resultado);
    }

    @Test
    public void insere_XIX_retorna_19() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XIX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(19, resultado);
    }
    
    @Test
    public void insere_XXIX_retorna_29() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXIX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(29, resultado);
    }
    
    @Test
    public void insere_XVI_retorna_16() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XVI";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(16, resultado);
    }
    
    @Test
    public void insere_VI_retorna_6() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "VI";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(6, resultado);
    }
    
    @Test
    public void insere_XXI_retorna_21() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXI";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(21, resultado);
    }
    
    @Test
    public void insere_LXVI_retorna_66() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "LXVI";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(66, resultado);
    }
    
    @Test
    public void insere_LXVII_retorna_67() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "LXVII";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(67, resultado);
    }
    
    @Test
    public void insere_IX_retorna_9() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "IX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(9, resultado);
    }
    
    @Test
    public void insere_XL_retorna_40() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XL";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(40, resultado);
    }
    
    @Test
    public void insere_XC_retorna_90() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XC";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(90, resultado);
    }
    
    @Test
    public void insere_CD_retorna_400() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "CD";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(400, resultado);
    }
    
    @Test
    public void insere_CM_retorna_900() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "CM";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(900, resultado);
    }
    
    @Test
    public void insere_XIII_retorna_13() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XIII";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(13, resultado);
    }
    
    @Test
    public void insere_XIV_retorna_14() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XIV";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(14, resultado);
    }
    
    @Test
    public void insere_XXXIII_retorna_33() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXXIII";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(33, resultado);
    }
    
    @Test
    public void insere_XXXIV_retorna_34() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XXXIV";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(34, resultado);
    }
    
    @Test
    public void insere_LIV_retorna_54() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "LIV";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(54, resultado);
    }
    
    @Test
    public void insere_CXXIX_retorna_129() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "CXXIX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(129, resultado);
    }
    
    @Test
    public void insere_XLIX_retorna_49() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "XLIX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
        assertEquals(49, resultado);
    }
    
    @Test(expected = Exception.class)
    public void insere_VIX_retorna_Exeption() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "VIX";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
//        assertEquals(49, resultado);
    }
    
    @Test(expected = Exception.class)
    public void insere_IL_retorna_Exeption() throws Exception {
        Converter converter = Converter.getInstance();
        String algarismoRomano = "IL";
        int resultado = converter.intArabicNumeralsForStringRomanNumerals(algarismoRomano);
//        assertEquals(49, resultado);
    }
}
