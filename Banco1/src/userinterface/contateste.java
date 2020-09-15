package userinterface;

import core.conta;

public class contateste {
			public static void main(String[]args) {
			conta c = new conta();
			
			c.setNomeTitular("maria pessoa");
			c.setCpf("148.368.018-50");
			c.setNumeroConta(23456);
			System.out.println(c.getNomeTitular());
			c.creditar(1000);
			if (c.debitar(200)) {
				System.out.println();
			}
			else {
				System.out.println();
			}
			System.out.println();
			}
		}
	
