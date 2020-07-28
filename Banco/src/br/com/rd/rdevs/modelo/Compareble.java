package br.com.rd.rdevs.modelo;

public interface Compareble<Conta> {
	
	String titular = null;

	public  int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);

		
	}
}


