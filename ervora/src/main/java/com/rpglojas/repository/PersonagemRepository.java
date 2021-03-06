package com.rpglojas.repository;

import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    @Query(
            value = "SELECT p FROM Personagem p WHERE p.isNpc = true"
    )
    List<Personagem> consultarNpcs();

}
