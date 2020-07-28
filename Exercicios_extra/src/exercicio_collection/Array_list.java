package exercicio_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Array_list {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		List<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
//		long fim = System.currentTimeMillis();
		
//		for (int i = 0; i < total; i++) {
//			teste.contains(i);
//		}
//		
//		int n = 60000;
//		System.out.println(teste.contains(n));
//
//		

		
		
		long fim = System.currentTimeMillis();
//		long tempo = fim - inicio;
		double tempo = (fim - inicio) ;
		System.out.println("Tempo gasto: " + tempo);
	}	
}
