package provas;

import java.util.Scanner;

public class questaoTeste {
	public static void main(String[] args) {
		questoes lista[];
		lista = new questoes[5];
		Scanner teclado = new Scanner(System.in);
		String resp;
				
		lista[0] = new questoes("Qual a religiao de Maria Madalena?", "catolica");
		lista[1] = new questoes("Quantos dias tem o mes de setembro?", " 30 dias");
		lista[2] = new questoes("Qual idade de Cristo?", "33 anos");
		lista[3] = new questoes("Qual o nome do presidente do Brasil?", "boconaro");
		lista[4] = new questoes("Quantos anos tem Rita?", "15 anos");
		
		for (questoes q: lista) {
			System.out.println(q.apresentarQuestao());
			resp = teclado.nextLine();
			if (q.corrigirQuestao(resp)) {
			System.out.println("Acertouuu");
			}
			else {
			System.out.println("Errouuuuuu");
			}
		}
		teclado.close();
	}
}