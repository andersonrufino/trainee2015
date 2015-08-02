
public class ATM {
	
	private int valorASerSacado;
	private int valorTotal;
	private int quantidadeDeCedulasDeDez;
	private int quantidadeDeCedulasDeVinte;
	private int quantidadeDeCedulasDeCinquenta;
	private int quantidadeDeCedulasDeCem;

	public ATM() {
		// TODO Auto-generated constructor stub
	}

	public int getValorASerSacado() {
		return this.valorASerSacado;
	}

	public void setValorASerSacado(int valorASerSacado) {
		this.valorASerSacado = valorASerSacado;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroDeCedulasDeDez() {
		return this.quantidadeDeCedulasDeDez;
	}

	public void setNumeroDeCedulasDeDez(int numeroDeCedulasDeDez) {
		this.quantidadeDeCedulasDeDez = numeroDeCedulasDeDez;
	}

	public int getNumeroDeCedulasDeVinte() {
		return this.quantidadeDeCedulasDeVinte;
	}

	public void setNumeroDeCedulasDeVinte(int numeroDeCedulasDeVinte) {
		this.quantidadeDeCedulasDeVinte = numeroDeCedulasDeVinte;
	}

	public int getNumeroDeCedulasDeCinquenta() {
		return this.quantidadeDeCedulasDeCinquenta;
	}

	public void setNumeroDeCedulasDeCinquenta(int numeroDeCedulasDeCinquenta) {
		this.quantidadeDeCedulasDeCinquenta = numeroDeCedulasDeCinquenta;
	}

	public int getNumeroDeCedulasDeCem() {
		return this.quantidadeDeCedulasDeCem;
	}

	public void setNumeroDeCedulasDeCem(int numeroDeCedulasDeCem) {
		this.quantidadeDeCedulasDeCem = numeroDeCedulasDeCem;
	}
	
	public int valorDasCedulas (){
		//Todas as regras de contar o valor de celula
		return this.valorTotal;
	}
		
	protected void calcularQuantidadeDeCedulasDeDez (int valorASerSacado) throws Exception{
		if(valorASerSacado % 10 == 0){
			this.quantidadeDeCedulasDeDez = valorASerSacado / 10;
		}else{
			throw new Exception("numero invalido, Só é permitido sacar quantidades possiveis com as cedulas: 100, 50, 20 e 10");
		}
	}
}
