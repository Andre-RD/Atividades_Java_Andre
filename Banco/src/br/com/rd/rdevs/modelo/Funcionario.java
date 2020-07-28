package br.com.rd.rdevs.modelo;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private int senha;
	
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getSenha(){
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	
}