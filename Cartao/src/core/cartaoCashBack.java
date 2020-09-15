package core;

public class cartaoCashBack extends cartaoPrePago {
	private int tipo; // 0-gold 1 silver 2 - bronze

	public cartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
		}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean comprar(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			switch(this.tipo){
			case 0:
				super.saldo +=valor * 0.08;
				break;
			case 1:
				super.saldo +=valor * 0.02;
				break;
			case 2:
				super.saldo +=valor * 0.05;
				break;
			return true;
		}
		return false;
		
				
		}	
		
	}
}

