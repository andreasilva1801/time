package provas;

public class questoes {
	private String enunciado;
	private String resposta;
	
	public questoes(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String apresentarQuestao() {
		return "Questao:"+enunciado;
	}
	public boolean corrigirQuestao(String respAluno) {
		return this.resposta.contentEquals(respAluno);
		
	}
	
}
