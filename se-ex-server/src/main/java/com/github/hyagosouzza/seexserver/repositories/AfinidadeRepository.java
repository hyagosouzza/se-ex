package com.github.hyagosouzza.seexserver.repositories;

import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.persistence.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AfinidadeRepository extends JpaRepository<Afinidade, String> {

	Optional<Afinidade> findByRegiao(String regiao);

}
