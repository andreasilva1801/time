package core;

public class conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}
	public boolean debitar(float valor) {
		if (saldo >= saldo) {
			saldo = saldo - valor;
		return true;
		}
		return false;
	}	
	public void creditar(float valor) {
		saldo =saldo + valor;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome Titular:"+nomeTitular+"CPF:"+cpf+"Numero da Conta:"+numeroConta+"Saldo: R$"+saldo);
		
	}
}

