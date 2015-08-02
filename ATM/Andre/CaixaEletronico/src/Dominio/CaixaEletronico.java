package Dominio;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
	
	private List<Cedula> cedulasEntregues = new ArrayList<Cedula>();
	private List<Cedula> cedulasDisponiveis = new ArrayList<Cedula>();
	
	public CaixaEletronico(){
		this(100,50,20,10);
	}

	private CaixaEletronico(int ...cedulas){
		for (int cedula : cedulas) {
			cedulasDisponiveis.add(new Cedula(cedula));
		}
	}
	
	public boolean valorValido(double valor){
		return valor % 10 == 0;
	}

	public String sacarCedulas(double valor) {
		if (!valorValido(valor)) {
			throw new IllegalArgumentException();
		}
 		for (Cedula cedula : cedulasDisponiveis) {
			valor = adicionaCedula(cedula, valor);
		}
		return escreveRetorno();
	}
	
	private double adicionaCedula(Cedula cedula, double valor) {
		int quantidade = (int) (valor / cedula.getValor());
		if (quantidade > 0) {
			cedula.setQuantidade(quantidade);
			cedulasEntregues.add(cedula);
		}
		return valor -= (cedula.getValor() * quantidade);
	}
	
	private String escreveRetorno() {
		String retorno = "";
		String conectivo = " e ";
		for (Cedula cedula : cedulasEntregues) {
			if (!retorno.isEmpty()) {
				retorno += conectivo;
			}
			
			if (cedula.getQuantidade() == 1) {
				retorno += "1 cedula de R$" + cedula.getValor();
			} else {
				retorno += cedula.getQuantidade() + " cedulas de R$" + cedula.getValor();
			}
		}
		return retorno;
	}
}
