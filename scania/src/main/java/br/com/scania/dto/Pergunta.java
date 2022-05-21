package br.com.scania.dto;

public class Pergunta {
	
	private long pergunta_id;
	private String pergunta;
	
	public Pergunta(long pergunta_id, String pergunta) {
		this.pergunta_id = pergunta_id;
		this.pergunta = pergunta;
	}

	public long getPergunta_id() {
		return pergunta_id;
	}

	public void setPergunta_id(long pergunta_id) {
		this.pergunta_id = pergunta_id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
}
