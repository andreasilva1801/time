
public class Carro {
	String marca;
	String modelo;
	String cor;
	String combustivel;
	int ano;
	int finalPlaca;
	float preco;
	
	void exibirAnuncui(){
		System.out.println("**** OFERTA IMPERDIVEL *****");
		System.out.println(marca+ "/" +modelo);
		System.out.println("Ano:"+ano);
		System.out.println("R$  "+preco);
		System.out.println("----------------------------");
	}
	
	float calcularIPVA() {
		floa ipva;
		ipva = preco * 0.03f;
		return ipva;
		
		
	}
}

