package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Dominio.CaixaEletronico;

public class CaixaEletronicoTest {

	@Test
	public void sacando_10_reais_recebo_1_cedula_de_10() {
		CaixaEletronico caixa = new CaixaEletronico();				
		double valor= 10.0;
		String resultado = caixa.sacarCedulas(valor);		
		assertEquals("1 cedula de R$10.0", resultado);
	}
	
	@Test
	public void sacando_20_reais_recebo_1_cedula_de_20() {
		CaixaEletronico caixa = new CaixaEletronico();				
		double valor= 20.0;
		String resultado = caixa.sacarCedulas(valor);		
		assertEquals("1 cedula de R$20.0", resultado);
	}

	@Test
	public void sacando_30_reais_recebo_1_cedula_de_10_e_1_cedula_de_20() {
		CaixaEletronico caixa = new CaixaEletronico();				
		double valor= 30.0;
		String resultado = caixa.sacarCedulas(valor);		
		assertEquals("1 cedula de R$20.0 e 1 cedula de R$10.0", resultado);
	}
	
	@Test
	public void sacando_170_reais_recebo_1_cedula_de_100_1_de_50_e_1_de_20() {
		CaixaEletronico caixa = new CaixaEletronico();				
		double valor= 170.0;
		String resultado = caixa.sacarCedulas(valor);		
		assertEquals("1 cedula de R$100.0 e 1 cedula de R$50.0 e 1 cedula de R$20.0", resultado);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void sacando_45_recebo_exception(){
		CaixaEletronico caixa = new CaixaEletronico();
		double valor = 45.0;
		caixa.sacarCedulas(valor);		
	}
	
	
	
}
