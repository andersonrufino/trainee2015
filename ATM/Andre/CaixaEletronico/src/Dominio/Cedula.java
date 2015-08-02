package Dominio;

public class Cedula {
	
	private double valor;
	private int quantidade;
	
	public Cedula(double valor){
		this.valor = valor;
		this.quantidade = 0;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}	
	
}

