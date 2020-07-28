package exercicio_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		// trocar depois por ArrayList
		List<Integer> teste = new LinkedList<>();
//		List<Integer> teste = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		// Teste primeiro For
		long fim = System.currentTimeMillis();
		
		// Teste com enhanced for 
//		for(Integer t : teste) {
//			int testeGet = teste.get(t);
//		}
//		

		
//		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) ;
		
		System.out.println("Tempo gasto: " + tempo);
	}
}
