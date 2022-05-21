package br.com.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.scania.model.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {

}
