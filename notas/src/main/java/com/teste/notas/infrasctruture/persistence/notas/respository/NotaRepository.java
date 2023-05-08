package com.teste.notas.infrasctruture.persistence.notas.respository;

import com.teste.notas.core.domain.entity.notas.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota,String> {
}
