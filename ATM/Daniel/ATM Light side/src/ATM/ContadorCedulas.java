package ATM;

import java.util.HashMap;
import java.util.Map;

public class ContadorCedulas {
	
	Map<Integer,Integer> cedulas;
	public ContadorCedulas(){
		cedulas = new HashMap<Integer,Integer>();
		cedulas.put(100, 0);
		cedulas.put(50, 0);
		cedulas.put(20, 0);
		cedulas.put(10, 0);		
	}
	
	public Map<Integer, Integer> numCedulas(int valor) throws Exception {
		
		int cem;
		int cinquenta;
		int vinte;
		int dez;
		int aux;
		
		cem = valor/100;
		aux = valor%100;
		
		cinquenta = aux/50;
		aux = aux%50;
		
		vinte = aux/20;
		aux = aux%20;
		
		dez = aux/10;
		aux = aux%10;
		
		if(aux!=0){
			throw new Exception("Valor inválido");
		}
		
		cedulas.replace(100, cem);
		cedulas.replace(50, cinquenta);
		cedulas.replace(20, vinte);
		cedulas.replace(10, dez);
		
		return cedulas;
	}

}
