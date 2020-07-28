package br.com.rd.rdevs.main;

import br.com.rd.rdevs.modelo.Conta;
import br.com.rd.rdevs.modelo.ContaCorrente;
import br.com.rd.rdevs.modelo.ContaPoupanca;

public class TestaConta {
	public static void main (String args[]) {
		Conta cc = new ContaPoupanca("");
		Conta minhaConta = new ContaCorrente("");
		try {
			minhaConta.getConta();
			minhaConta.setNumero(1);
			minhaConta.setTitular("Ivo");
			minhaConta.depositar(20000);
			minhaConta.sacar(200000);
		}catch(IllegalArgumentException e){
			
		}
		
//		minhaConta.transferir(cc, 1000);
//		minhaConta.getValorImposto();
		
		
		cc.getConta();
		cc.setTitular("Leo");
		cc.setNumero(2);
		
		
		minhaConta.recuperarDadosParaImpressao();
		cc.recuperarDadosParaImpressao();
	}
}
