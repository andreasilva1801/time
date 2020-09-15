package userint;

import core.cartaoPrePago;

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
		
		/*
		ContaEspecial c2;
		c2 = new ContaEspecial("Jose das Couves","222.333.444-55",9876, 500.0f);
		
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		c2.creditar(1000);
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		if (c2.debitar(800)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
			*/
	}
}

