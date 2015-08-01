package desafios;

public class CaixaEletronico {

	private static final int NOTA_DE_10 = 10;
	private static final int NOTA_DE_20 = 20;
	private static final int NOTA_DE_50 = 50;
	private static final int NOTA_DE_100 = 100;

	public String sacar(String valor) throws Exception {
		int valorNumerico = Integer.valueOf(valor);
		int multiplicador = 0;
		String saque = "";

		if (valorNumerico < 10) {
			throw new Exception("Não é possível sacar valores menores que 10!");
			
		} else {

			if (valorNumerico >= 100) {
				multiplicador = valorNumerico / 100;
				saque = multiplicador + " nota(s) de " + NOTA_DE_100 + " e ";
				valorNumerico -= (multiplicador * 100);
			}

			if (valorNumerico >= 50) {
				multiplicador = valorNumerico / 50;
				saque += multiplicador + " nota(s) de " + NOTA_DE_50 + " e ";
				valorNumerico -= (multiplicador * 50);
			}

			if (valorNumerico < 50 && valorNumerico >= 20) {
				multiplicador = valorNumerico / 20;
				saque += multiplicador + " nota(s) de " + NOTA_DE_20 + " e ";
				valorNumerico -= (multiplicador * 20);
			}

			if (valorNumerico < 20 && valorNumerico != 0) {
				multiplicador = valorNumerico / 10;
				saque += multiplicador + " nota(s) de " + NOTA_DE_10 + " ";
				valorNumerico -= (multiplicador * 10);
			}
			
			if (valorNumerico != 0) {
				throw new Exception("Só estão disponíveis notas de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00");
			}

		}

		return saque;
	}

}
