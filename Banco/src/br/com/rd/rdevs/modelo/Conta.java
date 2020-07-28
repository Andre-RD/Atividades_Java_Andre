package br.com.rd.rdevs.modelo;

public abstract class Conta implements Compareble<Object> {
		private int numero ;
		private String titular;
		public double saldo;
		protected String tipoConta;
		protected double valorImposto;
		private static int quantidadeContas=0;

	
//	public Conta() {
//		
//	}
	
//	public void getConta();
	
	public Conta(String titular2) {
		
		}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	public void setTitular(String titular) {
		this.titular = titular;
	}

//	public Conta() {
//		this.titular = titular;
//		
//	}

	public boolean sacar(double valorSacado){
		if(this.saldo <= valorSacado && valorSacado < 0){
			throw new IllegalArgumentException("Saldo insuficiente para Saques!! saldo atual" + this.saldo);

		}else{	
			this.saldo = this.saldo - valorSacado;
			return true;
		}
	}

	public boolean depositar(double valorDepositado){
		if (valorDepositado < 0){
			throw new IllegalArgumentException("Deposito de valor negativo");
		}else{
			this.saldo = this.saldo + valorDepositado;
			return true;
		}	
	}

	public boolean transferir(Conta destino, double valorTransferido){
		
		if(tipoConta == "corrente") {
			boolean retirou = this.sacar(valorTransferido);
			if (!retirou){
				throw new IllegalArgumentException("valor transferido invalido");
			}else{
				destino.depositar(valorTransferido);
				this.saldo = this.saldo - 0.1;
				return true;
			}
		}else{
			boolean retirou = this.sacar(valorTransferido);
			if (!retirou){
				throw new IllegalArgumentException("valor transferido invalido");
			}else{
				destino.depositar(valorTransferido);
				return true;
			}
		}
		
		
		
	}
	public double calcularRendimento() {	
		System.out.println("Rendimento: "+calcularRendimento());
		return this.saldo*0.1;
	}

	public void recuperarDadosParaImpressao() {
		System.out.println("Conta: "+this.numero);
		System.out.println("Tipo da conta: "+this.tipoConta);
		System.out.println("Titular: "+this.titular);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Valor Imposto: "+ this.valorImposto);
		System.out.println("-------------------------");
	}

	public abstract void getConta();

//	public abstract double getValorImposto();

}


