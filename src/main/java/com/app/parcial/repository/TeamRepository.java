package com.app.parcial.repository;


import com.app.parcial.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Modifying
    @Transactional
    @Query(value = """
        DELETE FROM team t WHERE t.id = :id
        """, nativeQuery = true)
    void eliminarId(@Param("id") Long id);
}
