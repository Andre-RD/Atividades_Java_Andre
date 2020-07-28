package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;

public class TestaArray {
	public static void main (String args[]) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente(null);
			conta.depositar(i * 100.0);
			conta.recuperarDadosParaImpressao();
		}
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente(null);		
			double total = contas.length;
			System.out.println("media: " + total);
		}
		
		}
		
		
}
