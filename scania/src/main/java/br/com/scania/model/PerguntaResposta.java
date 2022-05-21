package br.com.scania.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PERGUNTARESPOSTA")
public class PerguntaResposta {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perguntaRespostaSequence")
	@SequenceGenerator(name = "perguntaRespostaSequence", sequenceName = "perguntaRespostaSequence")
	@Id
	private Long perguntaResposta_id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pergunta_id", nullable = false)
	private Pergunta pergunta;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "resposta_id", nullable = false)
	private Resposta resposta;

	public PerguntaResposta(Usuario usuario, Pergunta pergunta, Resposta resposta) {
		this.usuario = usuario;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	public Long getPerguntaResposta_id() {
		return perguntaResposta_id;
	}

	public void setPerguntaResposta_id(Long perguntaResposta_id) {
		this.perguntaResposta_id = perguntaResposta_id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}
	
}
