package core;

public class questaoCDica extends questaoSimples {
	private String dica;

	public questaoCDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public String apresentarQuestao() {
		return super.enunciado+"\n  Dica:"+dica;
	}
}