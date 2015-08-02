package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import desafios.Buracos;

public class ContadorDeBuracosTeste {

	@Test
	public void contadorQueRecebeLetraADeveRetornar1() {
		Buracos buraco = new Buracos();
		
		int resultado = buraco.contadorDeBuracos("A");
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void contadorQueRecebeLetraBDeveRetornar2() {
		Buracos buraco = new Buracos();
		
		int resultado = buraco.contadorDeBuracos("B");
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void contadorQueRecebeYOLODeveRetornar2() {
		Buracos buraco = new Buracos();
		
		int resultado = buraco.contadorDeBuracos("YOLO");
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void contadorQueRecebeBURACODeveRetornar5() {
		Buracos buraco = new Buracos();
		
		int resultado = buraco.contadorDeBuracos("BURACO");
		
		assertEquals(5, resultado);
	}
	
	@Test
	public void contadorQueRecebe_buraco_DeveRetornar5() {
		Buracos buraco = new Buracos();
		
		int resultado = buraco.contadorDeBuracos("buraco");
		
		assertEquals(5, resultado);
	}
	
	

}
