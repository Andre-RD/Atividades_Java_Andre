package exercicio_collection;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
			c1.depositar(10000);
		Conta c2 = new ContaCorrente();
			c2.depositar(3000);
		// cria o mapa
			
		Map mapaDeContas = new HashMap();
		// adiciona duas chaves e seus valores
			mapaDeContas.put("diretor", c1);
			mapaDeContas.put("gerente", c2);
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		Conta contaDoGerente = (Conta) mapaDeContas.get("gerente");
		System.out.println(contaDoGerente.getSaldo());
	}

}
