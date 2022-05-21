package br.com.scania.dto;

public class PerguntaResposta {
	
	private long perguntaResposta_id;
	private long usuario_id;
	private long pergunta_id;
	private long resposta_id;
	
	public PerguntaResposta(long perguntaResposta_id, long usuario_id, long pergunta_id, long resposta_id) {
		this.perguntaResposta_id = perguntaResposta_id;
		this.usuario_id = usuario_id;
		this.pergunta_id = pergunta_id;
		this.resposta_id = resposta_id;
	}

	public long getPerguntaResposta_id() {
		return perguntaResposta_id;
	}

	public void setPerguntaResposta_id(long perguntaResposta_id) {
		this.perguntaResposta_id = perguntaResposta_id;
	}

	public long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public long getPergunta_id() {
		return pergunta_id;
	}

	public void setPergunta_id(long pergunta_id) {
		this.pergunta_id = pergunta_id;
	}

	public long getResposta_id() {
		return resposta_id;
	}

	public void setResposta_id(long resposta_id) {
		this.resposta_id = resposta_id;
	}
	
}
