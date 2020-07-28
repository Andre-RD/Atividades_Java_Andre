package br.com.rd.rdevs.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercicio_collection.Conta;


public class Banco {
	
	List<Conta> contas = new ArrayList<Conta>();
	Map<String, Conta> mapContas = new HashMap<String, Conta>();
	
	
		
	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapContas.put(c.getTitular(),c);
	}
	
	public Conta pegaConta(int i) {
		return this.contas.get(i);
	}
	
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return this.mapContas.get(nome);
	}
	
}


