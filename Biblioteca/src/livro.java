
public class livro {
	private String titulo;
	private String autor;
	private String categoria;
	private int anoDePublicacao;
	private int numeroestante;
	private int numeroPrateleira;
	private boolean emprestado;
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}



	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}



	public int getNumeroestante() {
		return numeroestante;
	}



	public void setNumeroestante(int numeroestante) {
		this.numeroestante = numeroestante;
	}



	public int getNumeroPrateleira() {
		return numeroPrateleira;
	}



	public void setNumeroPrateleira(int numeroPrateleira) {
		this.numeroPrateleira = numeroPrateleira;
	}
	
	

	public boolean isEmprestado() {
		return emprestado;
	}



	public void emprestado() {
		emprestado = true;
	}
	
	public void disponivel() {
		emprestado = false;
	}
	
	public livro(String titulo,String autor,String categoria,int anoDePublicacao,int numeroestante,int numeroPrateleira,boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.anoDePublicacao = anoDePublicacao;
		this.numeroestante = numeroestante;
		this.numeroPrateleira = numeroPrateleira;
		this.emprestado = emprestado;
	}
	/*public void status(boolean emprestado) {
		if (emprestado == true) {
				System.out.println("livro emprestado");
		}
		else { 
			System.out.println("livro disponivel");
		}
	}*/
	public void emprestar() {
		emprestado = false;
	}
	public void devolver() {
		emprestado = true;
	}
	
	public void exibirInformacao() {
		System.out.println(" CADASTRO BIBLIOTECA  ");
		System.out.println("Titulo:" + titulo);
		System.out.println("Ano de Publicacao: " + anoDePublicacao);
		System.out.println("Estante: "+ numeroestante);
		System.out.println("Prateleira: "+ numeroPrateleira);
		if (emprestado) {
			System.out.println("Livro Disponivel");
		}
		else {
			System.out.println("Livro Emprestado");
		}
	}
}
