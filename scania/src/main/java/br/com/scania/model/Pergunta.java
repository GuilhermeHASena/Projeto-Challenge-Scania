package br.com.scania.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PERGUNTA")
public class Pergunta {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="perguntaSequence")
	@SequenceGenerator(name="perguntaSequence", sequenceName="perguntaSequence")
	@Id
	private Long pergunta_id;
	
	@Column(nullable = false)
	private String pergunta;
	
	@OneToMany(mappedBy = "pergunta", cascade = CascadeType.DETACH, fetch = FetchType.EAGER) 
	private	Set<PerguntaResposta> perguntaResposta;
	
	@OneToMany(mappedBy = "pergunta", cascade = CascadeType.DETACH, fetch = FetchType.EAGER) 
	private	Set<Resposta> resposta;

	public Pergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public Long getPergunta_id() {
		return pergunta_id;
	}

	public void setPergunta_id(Long pergunta_id) {
		this.pergunta_id = pergunta_id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
}
