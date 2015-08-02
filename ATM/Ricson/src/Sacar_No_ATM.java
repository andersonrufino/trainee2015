import static org.junit.Assert.*;

import org.junit.Test;

public class Sacar_No_ATM {
	/*
	 * Dez_Reais_Devolve_Uma_Nota_De_Dez  -----  10
	 * Vinte_Reais_Devolve_Uma_Nota_De_Vinte ----- 20
	 * Trinta_Reais_Devolve_Uma_Nota_De_Dez_E_Uma_De_Vinte -- 30
	 * Quarenta_Reais_Devolve_Duas_Notas_De_Vinte -- 40
	 * Noventa_Reais_Devolve_Uma_Nota_De_Cinquenta_E_Duas_Notas_De_Vinte --- 90
	 * Duzentos_E_Cinquenta_Reais_Devolve_Tres_Notas_De_Cem_E_Uma_De_Cinquenta --- 250
	 * Noventa_E_Tres_Reais_Devolve_Uma_Exception -- 93
	 * Trezentos_Reais_Devolve_Tres_Notas_De_Cem -- 300
	 * Quinhentos_E_Sessenta_Reais_Devolve_Cinco_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Dez -- 560
	 * Setecentos_E_Oitenta_Reais_Devolve_Sete_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Vinte_E_Uma_De_Dez -- 780
	 * Dois_Mil_E_Oitocentos_E_setenta_Reais_Devolve_Vinte_E_Oito_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Vinte -- 2870
	 * Quarenta_E_Cinco_Mil_Duzentos_E_Dez_Reais_Devolve_Quatrocentos_E_Cinquenta_E_Duas_Notas_De_Cem_E_Uma_De_Dez -- 45210
	 * Oitenta_E_Dois_Mil_Quatrocentos_E_Setenta_Devolve_Oitocentas_E_Vinte_E_Quatro_Notas_De_Cem_Uma_De_Cinquenta_E_uma_De_Vinte -- 82470
	 */
	@Test
	public void Dez_Reais_Devolve_Uma_Nota_De_Dez() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(10);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(1, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(10, valorDasCedulasSomadas);
	}
	
	@Test
	public void Vinte_Reais_Devolve_Uma_Nota_De_Vinte() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(20);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(1, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(20, valorDasCedulasSomadas);
	}
	
	@Test
	public void Trinta_Reais_Devolve_Uma_Nota_De_Dez_E_Uma_De_Vinte() throws Exception{
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(30);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(1, quantidadeDeCedulasDeDez);
		assertEquals(1, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(30, valorDasCedulasSomadas);
	}
	
	@Test
	public void Quarenta_Reais_Devolve_Duas_Notas_De_Vinte() throws Exception{
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(40);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(2, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(40, valorDasCedulasSomadas);
	}
	@Test
	public void Noventa_Reais_Devolve_Uma_Nota_De_Cinquenta_E_Duas_Notas_De_Vinte() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(90);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(2, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(90, valorDasCedulasSomadas);
	}
	
	@Test (expected = Exception.class)
	public void Noventa_E_Tres_Reais_Devolve_Uma_Exception() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(93);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(0, quantidadeDeCedulasDeCem);
		assertEquals(0, valorDasCedulasSomadas);	
	}
	
	@Test
	public void Duzentos_E_Cinquenta_Reais_Devolve_Tres_Notas_De_Cem_E_Uma_De_Cinquenta() throws Exception {
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(250);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(2, quantidadeDeCedulasDeCem);
		assertEquals(250, valorDasCedulasSomadas);
	}
	
	@Test
	public void Trezentos_Reais_Devolve_Tres_Notas_De_Cem() throws Exception {
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(300);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(3, quantidadeDeCedulasDeCem);
		assertEquals(300, valorDasCedulasSomadas);
	}
	
	@Test
	public void Quinhentos_E_Sessenta_Reais_Devolve_Cinco_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Dez() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(560);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(1, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(5, quantidadeDeCedulasDeCem);
		assertEquals(560, valorDasCedulasSomadas);
	}
	
	@Test
	public void Setecentos_E_Oitenta_Reais_Devolve_Sete_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Vinte_E_Uma_De_Dez() throws Exception {
		//Arrange
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(780);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(1, quantidadeDeCedulasDeDez);
		assertEquals(1, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(7, quantidadeDeCedulasDeCem);
		assertEquals(780, valorDasCedulasSomadas);
	}
	
	@Test
	public void Dois_Mil_E_Oitocentos_E_setenta_Reais_Devolve_Vinte_E_Oito_Notas_De_Cem_Uma_De_Cinquenta_E_Uma_De_Vinte() throws Exception {
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(2870);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(1, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(28, quantidadeDeCedulasDeCem);
		assertEquals(2870, valorDasCedulasSomadas);
	}
	
	@Test
	public void Quarenta_E_Cinco_Mil_Duzentos_E_Dez_Reais_Devolve_Quatrocentos_E_Cinquenta_E_Duas_Notas_De_Cem_E_Uma_De_Dez() throws Exception {
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(45210);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();		
		//Assert
		
		assertEquals(1, quantidadeDeCedulasDeDez);
		assertEquals(0, quantidadeDeCedulasDeVinte);
		assertEquals(0, quantidadeDeCedulasDeCinquenta);
		assertEquals(452, quantidadeDeCedulasDeCem);
		assertEquals(45210, valorDasCedulasSomadas);
	}
	
	
	@Test
	public void Oitenta_E_Dois_Mil_Quatrocentos_E_Setenta_Devolve_Oitocentas_E_Vinte_E_Quatro_Notas_De_Cem_Uma_De_Cinquenta_E_uma_De_Vinte() throws Exception {
		SeparadorDeCedulas separadorDeCedulas = new SeparadorDeCedulas();
		separadorDeCedulas.setValorASerSacado(82470);
		separadorDeCedulas.valorNecessitaApenasDeUmaCedula();
		separadorDeCedulas.separaCedulasDeValoresMaiorQueCem();
		separadorDeCedulas.separaCedulasDeValoresMenorQueCem();
		
		//Act
		int valorDasCedulasSomadas = separadorDeCedulas.getValorDasCedulas();
		int quantidadeDeCedulasDeDez = separadorDeCedulas.getNumeroDeCedulasDeDez();
		int quantidadeDeCedulasDeVinte = separadorDeCedulas.getNumeroDeCedulasDeVinte();
		int quantidadeDeCedulasDeCinquenta = separadorDeCedulas.getNumeroDeCedulasDeCinquenta();
		int quantidadeDeCedulasDeCem = separadorDeCedulas.getNumeroDeCedulasDeCem();		
		//Assert
		
		assertEquals(0, quantidadeDeCedulasDeDez);
		assertEquals(1, quantidadeDeCedulasDeVinte);
		assertEquals(1, quantidadeDeCedulasDeCinquenta);
		assertEquals(824, quantidadeDeCedulasDeCem);
		assertEquals(82470, valorDasCedulasSomadas);
	}
}
