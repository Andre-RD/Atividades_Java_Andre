package br.com.rd.rdevs.main;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TesteCollections {
	
	public static void main(String args[]) {
	
//		Set<String> conjunto = new HashSet<>();
//		conjunto.add("Teste 4");
//		conjunto.add("Teste 3");
//		conjunto.add("Teste 1");
//		conjunto.add("Teste 2");
//		conjunto.add("Teste 5");
//		
////		for(String texto : conjunto) {
////			System.out.println(texto);
////		}
//		
//		Iterator<String> i = conjunto.iterator();
//		
//		while(i.hasNext()) {	 
//			String texto = i.next();
//			System.out.println(texto);
//		}
		
		Properties config = new Properties();
		
		config.setProperty("database.login", "leo");
		config.setProperty("database.password", "12345");
		config.setProperty("database.url", "leo");
		
		

		
		
	}
}
