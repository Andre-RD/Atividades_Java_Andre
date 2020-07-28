package br.com.rd.rdevs.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	protected double impostoCorrente;
	public ContaCorrente(String titular) {
		super(titular);
		
		this.valorImposto = impostoCorrente;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Object outraConta) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void getConta() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void getConta() {
//		this.tipoConta = "corrente";
//		
//	}
//
//	@Override
//	public double getValorImposto() {
//		impostoCorrente = (this.saldo * 0.01);
//		return impostoCorrente;
//	}

}
