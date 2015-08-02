
public class SeparadorDeCedulas {
	ATM atm = new ATM();
	private int valorTotal = atm.getValorTotal();
	private int valorASerSacado = atm.getValorASerSacado();
	private int quantidadeDeCedulasDeDez = atm.getNumeroDeCedulasDeDez();
	private int quantidadeDeCedulasDeCem = atm.getNumeroDeCedulasDeCem();
	
	public void setValorASerSacado(int valorASerSacado){
		this.valorASerSacado = valorASerSacado;
	}
	
	public void valorNecessitaApenasDeUmaCedula (){
		if(valorASerSacado == 100){
			atm.setValorTotal(100);
			atm.setNumeroDeCedulasDeCem(1);
		}
		
		if (valorASerSacado == 50){
			atm.setValorTotal(50);
			atm.setNumeroDeCedulasDeCinquenta(1);
		}
			 
		if(valorASerSacado == 20){
			atm.setValorTotal(20);
			atm.setNumeroDeCedulasDeVinte(1);
		}
		
		if(valorASerSacado == 10){
			atm.setValorTotal(10);
			atm.setNumeroDeCedulasDeDez(1);
		}
	}
	
	public void separaCedulasDeValoresMenorQueCem () throws Exception {
		if(this.valorASerSacado < 100 ){
			atm.calcularQuantidadeDeCedulasDeDez(this.valorASerSacado);
			
			if(atm.getNumeroDeCedulasDeDez() < 5){
				if(atm.getNumeroDeCedulasDeDez() == 2){
					this.valorTotal += 20;
					atm.setValorTotal(valorTotal);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 3){
					this.valorTotal += 30;
					atm.setValorTotal(valorTotal);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 4){
					this.valorTotal += 40;
					atm.setValorTotal(valorTotal);
					atm.setNumeroDeCedulasDeVinte(2);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
			}else{
				this.valorTotal += 50;
				atm.setValorTotal(valorTotal);
				atm.setNumeroDeCedulasDeCinquenta(1);
				quantidadeDeCedulasDeDez = atm.getNumeroDeCedulasDeDez();
				atm.setNumeroDeCedulasDeDez(quantidadeDeCedulasDeDez - 5);
				
				if(atm.getNumeroDeCedulasDeDez() == 1){
					atm.setValorTotal(valorTotal + 10);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 2){
					atm.setValorTotal(valorTotal + 20);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 3){
					atm.setValorTotal(valorTotal + 30);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 4){
					atm.setValorTotal(valorTotal + 40);
					atm.setNumeroDeCedulasDeVinte(2);
					atm.setNumeroDeCedulasDeDez(0);
				}
			}
		}
	}
	
	public void separaCedulasDeValoresMaiorQueCem () throws Exception{
		if(this.valorASerSacado > 100){
			while(valorASerSacado >= 100){
				quantidadeDeCedulasDeCem++; 
				valorTotal += 100;
				valorASerSacado -= 100;
			}
			atm.setNumeroDeCedulasDeCem(quantidadeDeCedulasDeCem);
			atm.setValorTotal(valorTotal);
			atm.calcularQuantidadeDeCedulasDeDez(this.valorASerSacado);
			this.quantidadeDeCedulasDeDez = atm.getNumeroDeCedulasDeDez();
			if(atm.getNumeroDeCedulasDeDez() < 5){
				
				if(atm.getNumeroDeCedulasDeDez() == 1){
					atm.setValorTotal(valorTotal + 10);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 2){
					atm.setValorTotal(valorTotal + 20);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 3){
					atm.setValorTotal(valorTotal + 30);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 4){
					atm.setValorTotal(valorTotal + 40);
					atm.setNumeroDeCedulasDeVinte(2);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
			}else{
				atm.setValorTotal(valorTotal + 50);
				atm.setNumeroDeCedulasDeCinquenta(1);
				atm.setNumeroDeCedulasDeDez(this.quantidadeDeCedulasDeDez -= 5);
				

				if(atm.getNumeroDeCedulasDeDez() == 1){
					atm.setValorTotal(valorTotal + 10);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 2){
					atm.setValorTotal(valorTotal + 20);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(0);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 3){
					atm.setValorTotal(valorTotal + 30);
					atm.setNumeroDeCedulasDeVinte(1);
					atm.setNumeroDeCedulasDeDez(1);
				}
				
				if(atm.getNumeroDeCedulasDeDez() == 4){
					atm.setValorTotal(valorTotal + 40);
					atm.setNumeroDeCedulasDeVinte(2);
					atm.setNumeroDeCedulasDeDez(0);
				}
			}
		}
	}

	public int getNumeroDeCedulasDeDez() {
		return atm.getNumeroDeCedulasDeDez();
	}

	public int getValorDasCedulas() {
		return atm.getValorTotal();
	}

	public int getNumeroDeCedulasDeCinquenta() {
		return atm.getNumeroDeCedulasDeCinquenta();
	}

	public int getNumeroDeCedulasDeVinte() {
		return atm.getNumeroDeCedulasDeVinte();
	}

	public int getNumeroDeCedulasDeCem() {
		return atm.getNumeroDeCedulasDeCem();
	}
}
