package userin;

import java.util.Scanner;

import core.questaoSimples;
import core.questaoMEscolha;
import core.questaoCDica;

public class aplicaProva {
	public static void main(String[] args) {
		
		questaoSimples lista[];
		lista = new questaoSimples[6];
		Scanner teclado = new Scanner(System.in);
		String resp;
		
				
		lista[0] = new questaoSimples("Qual a religiao de Maria Madalena?", "catolica");
		lista[1] = new questaoSimples("Quantos dias tem o mes de setembro?", "30 dias");
		lista[2] = new questaoMEscolha("Qual idade de Cristo?", "33","31","30","29","10");
		lista[3] = new questaoMEscolha("Quanto vale 2+2?", "22", "4", "5", "2", "0 ");
		lista[4] = new questaoCDica("Quanto vale 10 - 10?","0", "Cuidado com os sinais");
		lista[5] = new questaoCDica("Quantos dias tem o mes de Setembro?","30 dias","Um a menos que o mes de Agosto");
				
				
		for (questaoSimples q: lista) {
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

