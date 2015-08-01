package Teste;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ATM.ContadorCedulas;

public class TesteAtm {
	
	
	@Test
	public void recebe_100_saca_1_nota_de_100() throws Exception {
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(100);
		assertEquals(1, (int)totalCedulas.get(100));
	}
	
	@Test
	public void recebe_50_saca_1_nota_de_50() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(50);
		assertEquals(1, (int)totalCedulas.get(50));
	}
	
	@Test
	public void recebe_150_saca_1_nota_de_50_e_1_de_100() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(150);
		assertEquals(1, (int)totalCedulas.get(50));
		assertEquals(1, (int)totalCedulas.get(100));
		
	}
	@Test
	public void recebe_110_saca_1_nota_de_10_e_1_de_100() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(110);
		assertEquals(1, (int)totalCedulas.get(10));
		assertEquals(1, (int)totalCedulas.get(100));
		
	}
	
	@Test
	public void recebe_130_saca_1_nota_de_10_100_20()throws Exception {
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(130);
		assertEquals(1, (int)totalCedulas.get(10));
		assertEquals(1, (int)totalCedulas.get(20));
		assertEquals(1, (int)totalCedulas.get(100));
		
	}
	
	@Test
	public void recebe_7990_saca_79_100__1_50__2_20() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(7990);
		assertEquals(79, (int)totalCedulas.get(100));
		assertEquals(2, (int)totalCedulas.get(20));
		assertEquals(1, (int)totalCedulas.get(50));
		
	}
	
	@Test(expected = Exception.class)
	public void recebe_87_excecao() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(87);		
	}
	
	@Test(expected = Exception.class)
	public void recebe_1532_excecao() throws Exception{
		ContadorCedulas contador = new ContadorCedulas();
		Map<Integer,Integer> totalCedulas = contador.numCedulas(1532);		
	}

}
