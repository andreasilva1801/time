
public class UebMotors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1, c2, c3;
		c1 = new Carro();
		c2 = new Carro();
		c3 = new Carro();
		
		c1.marca = hyndai;
		c1.modelo = hb20;
		c1.cor = vermelho;
		c1.combustivel = flex;
		c1.ano = 2011;
		
			
		
				
	    c1.exibirAnuncio();
		float impostoC1 = c1.calcularIPVA();
		System.out.println("valor do ipva = "+impostoC1);
		
		
		
		
		
	}

}
