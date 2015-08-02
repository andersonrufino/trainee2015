package desafios;

public class Buracos {

	char[] letrasComUmBuraco = { 'A', 'D', 'O', 'P', 'Q', 'R' };

	char letraComDoisBuracos = 'B';

	public int contadorDeBuracos(String palavra) {
		int count = 0;	
		
		
		palavra = palavra.toUpperCase();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j < letrasComUmBuraco.length; j++) {
				if (palavra.charAt(i) == letrasComUmBuraco[j]) {
					count++;
					break;
				} else if (palavra.charAt(i) == letraComDoisBuracos) {
					count += 2;
					break;
				}
			}
		}
		return count;
	}

}
