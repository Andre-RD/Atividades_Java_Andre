package exercicios_java_lang;

public class Testes_String {

	public static void main(String[] args) {
//		String testaIndexOf = "aasfsafcachorroasdfsad";
//		String testaStrip = "       ovelha negra      ";
//		String testaStripAtivo = testaStrip.strip();
//		String testaTrim = "";
//		
//		if(testaIndexOf.indexOf("cachorro") >= 0 ) {
//			System.out.println("Tem um cachorro escondido");
//			System.out.println(testaIndexOf.indexOf("cachorro"));
//		}else {
//			System.out.println("Não tem nada!");
//			System.out.println(testaIndexOf.indexOf("cachorro"));
//		}
//		
//		System.out.println("Sem strip():"+ testaStrip);
//		System.out.println("Com strip():"+ testaStripAtivo);
//		if (testaTrim.trim().equals("")) throw new IllegalArgumentException();
		String numeroString = "1234";
		int numeroInt = Integer.parseInt(numeroString);
		
		

//		int i =  numeroString.charAt(0);
//		System.out.println(i - 48);
//		
//		System.out.println("Numero inteiro multplicado por 2: " + numeroInt*2);
//		System.out.println("String que não da para fazer operação: " + numeroString);
//		
//		
//	
//		escreverAoContrario("Socorram-me, subi no ônibus em Marrocos");
//		escreverAoContrario(" anotaram a data da maratona ");
////		escreverEmColunas("ornitorrinco");
		
	}
	public static void escreverEmColunas (String nome){
		System.out.println("Nome por extenso: "+ nome);
		System.out.println("Nome em colunas :");
		for(int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
	public static void escreverAoContrario (String nome){
		for(int i=nome.length() ; i > 0 ; i--) {
			System.out.print(nome.charAt(i-1));
		}
		
	}

}
