public class biblioteca {
	public static void main(String args[] ){
		// TODO Auto-generated method stub
		livro a1,a2,a3, a4, a5;
		
		a1 = new livro("vento levou", "Andrea Silva","romance",2010, 2, 5,false);
		a2 = new livro("vida seca","ana valeria","policial",2019, 3, 1,true);
		a3 = new livro(" vida","Ana Brito"," romance",1830, 1, 2, false);
		a4 = new livro("Deus existe","Ana Brito"," romance",1835,4,5,true);
		a5 = new livro("fusca","Ana Brito"," drama",1900, 1,5, false);
	
		a1.exibirInformacao();
		a2.exibirInformacao();
		a3.exibirInformacao();
		a4.exibirInformacao();
		a5.exibirInformacao();
	}
}