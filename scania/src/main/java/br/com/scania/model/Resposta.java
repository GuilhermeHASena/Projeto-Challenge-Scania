package br.com.scania.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_RESPOSTA")
public class Resposta {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="respostaSequence")
	@SequenceGenerator(name="respostaSequence", sequenceName="respostaSequence")
	@Id
	private Long resposta_id;
	
	@Column(nullable = false)
	private String resposta;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pergunta_id", nullable = false)
    private Pergunta pergunta;
	
	@OneToMany(mappedBy = "resposta", cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Set<PerguntaResposta> perguntaResposta;

	public Resposta(String resposta, Pergunta pergunta) {
		this.resposta = resposta;
		this.pergunta = pergunta;
	}

	public Long getResposta_id() {
		return resposta_id;
	}

	public void setResposta_id(Long resposta_id) {
		this.resposta_id = resposta_id;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
}
