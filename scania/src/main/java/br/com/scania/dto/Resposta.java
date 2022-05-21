package br.com.scania.dto;

public class Resposta {
	
	private long resposta_id;
	private long pergunta_id;
	private String resposta;
	
	public Resposta(long resposta_id, long pergunta_id, String resposta) {
		this.resposta_id = resposta_id;
		this.pergunta_id = pergunta_id;
		this.resposta = resposta;
	}

	public long getResposta_id() {
		return resposta_id;
	}

	public void setResposta_id(long resposta_id) {
		this.resposta_id = resposta_id;
	}

	public long getPergunta_id() {
		return pergunta_id;
	}

	public void setPergunta_id(long pergunta_id) {
		this.pergunta_id = pergunta_id;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
