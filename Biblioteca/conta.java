
public class conta {
	String nomeTitular;
	String cpf;
	int numeroConta;
	float saldo;
	
	
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
	public boolean debitar(float debito) {
		if (saldo >= saldo) {
			saldo = saldo - debitar;
			return true
		}
	public void creditar(float credito) {
		saldo =saldo + credito;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome Titular:"+nomeTitular+"CPF:"+cpf+"Numero da Conta:"+numeroConta+"Saldo: R$"+saldo);
		
	}
	}
}
