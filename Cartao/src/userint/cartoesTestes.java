package userint;

import core.cartaoPrePago;
import core.cartaoCashBack;

public class cartoesTestes {
	public static void main(String[]args) {
		cartaoPrePago cp1;
		
		cp1 = new cartaoPrePago("5555.3333.2222.4545", "maria regina silva", 20, 12);
		
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		cp1.adicionar(1000);
		
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		if (cp1.comprar(4000)) {
			System.out.println("Compra efetuada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		System.out.println();
		
		
		cartaoCashBack cc2;
		
		cc2 = new cartaoCashBack(1);
		
		System.out.println(cc2.getNumeroCartao()+"-"+cc2.getNomeTitular()+"-"+cc2.getAnoValidade()+"/"+cc2.getMesValidade()+" R$ "+cc2.getTipo());
		
		cc2.adicionar(1000);
		
		System.out.println(cc2.getNumeroCartao()+"-"+cc2.getNomeTitular()+"-"+cc2.getAnoValidade()+"/"+cc2.getMesValidade()+" R$ "+cc2.getTipo());
		
		if (cp1.comprar(4000)) {
			System.out.println("Compra efetuada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		cp1.adicionar(1000);
		
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		if (cp1.comprar(4000)) {
			System.out.println("Compra efetuada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(cp1.getNumeroCartao()+"-"+cp1.getNomeTitular()+"-"+cp1.getAnoValidade()+"/"+cp1.getMesValidade()+" R$ "+cp1.getSaldo());
		
		System.out.println();
		
		System.out.println();
	}
}

