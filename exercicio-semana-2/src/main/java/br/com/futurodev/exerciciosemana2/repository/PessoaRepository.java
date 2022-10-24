package br.com.futurodev.exerciciosemana2.repository;

import br.com.futurodev.exerciciosemana2.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query (value = " select c from Pessoa c where c.nome like %?1%")
    ArrayList<Pessoa> getPessoaByName(String name);
}
