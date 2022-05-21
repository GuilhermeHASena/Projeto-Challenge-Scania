package br.com.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.scania.model.PerguntaResposta;

@Repository
public interface PerguntaRespostaRepository extends JpaRepository<PerguntaResposta, Long> {

}
