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
		
			else if (tipo == 1) {
				super.saldo = super.saldo (0.2 * saldo);
				
			
		}
		else if (tipo == 2) {
			
		}
		else if (tipo == 3) {
			
		}
		else if(tipo == 4) {
			
		}
		else if (tipo == 5){
			System.out.printf(" por favor tipo do cartão invalido",tipo);	
			
		}
	}
}
