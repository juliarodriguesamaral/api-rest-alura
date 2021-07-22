package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // É ideal usar underline para evitar ambiguidades caso seja criado um atributo "cursoNome". O underline indica que na classe "Curso" há o atributo "nome"
    List<Topico> findByCurso_Nome(String nomeCurso);


    /*

    É possível personalizar o nome do método, mas com isso é necessário criar a Query com JPQL:

    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    List<Topico> carregarPorNomedoCurso(@Param("nomeCurso") String nomeCurso);

     */
}
