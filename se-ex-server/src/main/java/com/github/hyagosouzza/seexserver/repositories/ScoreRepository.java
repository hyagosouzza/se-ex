package com.github.hyagosouzza.seexserver.repositories;

import com.github.hyagosouzza.seexserver.persistence.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, String> {

	@Query("from Score where ?1 between inicial and ffinal")
	Optional<Score> findByScoreValue(Integer scoreValue);

}
