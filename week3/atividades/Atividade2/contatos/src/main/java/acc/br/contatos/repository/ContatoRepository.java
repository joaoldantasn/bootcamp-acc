package acc.br.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import acc.br.contatos.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
