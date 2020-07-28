package br.com.rd.rdevs.modelo;

public class Presidente extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.15;
	}
}
