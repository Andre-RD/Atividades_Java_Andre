package br.com.rd.rdevs.main;


import br.com.rd.rdevs.modelo.Funcionario;
import br.com.rd.rdevs.modelo.Gerente;

public class TesteGerente {
	public static void main(String args[]) {
//		Funcionario f = new Funcionario();
//		f.setSalario(1000);
//		f.bonificacao1();
		
		Gerente g = new Gerente();
		g.setSalario(20000);
		g.getBonificacao();
		
		
	}
}
