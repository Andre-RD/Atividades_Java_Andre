package br.com.rd.rdevs.modelo;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.15;
	}
	
	
	
	
	
	public boolean autentica(int senha) {
		if (this.getSenha() == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
