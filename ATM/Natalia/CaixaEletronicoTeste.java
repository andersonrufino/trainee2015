package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desafios.CaixaEletronico;

public class CaixaEletronicoTeste {
	
	//Sacar_10_Receber_1_Nota_de_10
	//Sacar_20_Receber_1_Nota_de_20
	//Sacar_50_Receber_1_Nota_de_50
	//Sacar_100_Receber_1_Nota_de_100
	//Sacar_40_Receber_2_Notas_de_20
	//Sacar_30_Receber_1_Nota_de_20_e_1_nota_de_10
	//Sacar_60_Receber_1_Notas_de_50_e_1_nota_de_10
	//Sacar_70_Receber_1_Nota_de_50_e_1_nota_de_20
	//Sacar_80_Receber_1_Nota_de_50_e_1_nota_de_20_e_1_nota_de_10
	//Sacar_90_Receber_1_Nota_de_50_e_2_notas_de_20
	//Sacar_1580_Receber_15_Notas_de_100_e_1_nota_de_50_e_1_nota_de_20_e_1_nota_de_10
	//Sacar_35890_Receber_358_Notas_de_100_e_1_nota_de_50_e_2_nota_de_20
	//Sacar_1_Receber_Mensagem_de_erro
	//Sacar_1585_Receber_Mensagem_de_erro
	

	@Test
	public void sacar_10_Receber_1_Nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("10");
		
		assertEquals("1 nota(s) de 10 ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_20_Receber_1_Nota_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("20");
		
		assertEquals("1 nota(s) de 20 e ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_50_Receber_1_Nota_de_50() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("50");
		
		assertEquals("1 nota(s) de 50 e ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_100_Receber_1_Nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("100");
		
		assertEquals("1 nota(s) de 100 e ", dinheiroRecebido);
	}
	
	@Test
	public void Sacar_40_Receber_2_Notas_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("40");
		
		assertEquals("2 nota(s) de 20 e ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_30_Receber_1_Nota_de_20_e_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("30");
		
		assertEquals("1 nota(s) de 20 e 1 nota(s) de 10 ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_60_Receber_1_Notas_de_50_e_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("60");
		
		assertEquals("1 nota(s) de 50 e 1 nota(s) de 10 ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_70_Receber_1_Nota_de_50_e_1_nota_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("70");
		
		assertEquals("1 nota(s) de 50 e 1 nota(s) de 20 e ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_80_Receber_1_Nota_de_50_e_1_nota_de_20_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("80");
		
		assertEquals("1 nota(s) de 50 e 1 nota(s) de 20 e 1 nota(s) de 10 ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_90_Receber_1_Nota_de_50_e_2_notas_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("90");
		
		assertEquals("1 nota(s) de 50 e 2 nota(s) de 20 e ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_1580_Receber_15_Notas_de_100_e_1_nota_de_50_e_1_nota_de_20_e_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("1580");
		
		assertEquals("15 nota(s) de 100 e 1 nota(s) de 50 e 1 nota(s) de 20 e 1 nota(s) de 10 ", dinheiroRecebido);
	}
	
	@Test
	public void sacar_35890_Receber_358_Notas_de_100_e_1_nota_de_50_e_2_nota_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String dinheiroRecebido = caixaEletronico.sacar("35890");
		
		assertEquals("358 nota(s) de 100 e 1 nota(s) de 50 e 2 nota(s) de 20 e ", dinheiroRecebido);
	}
	
	@Test (expected = Exception.class)
	public void sacar_1_Receber_Mensagem_de_erro() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		caixaEletronico.sacar("1");		
	}
	
	@Test (expected = Exception.class)
	public void sacar_1585_Receber_Mensagem_de_erro() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		caixaEletronico.sacar("1585");		
	}

}
