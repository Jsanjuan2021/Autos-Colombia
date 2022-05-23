package com.iudigital.autoscolombia.repositorios;

import com.iudigital.autoscolombia.modelo.Tercero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoTercero extends JpaRepository<Tercero, Long> {
    Tercero findTerceroByDni(Long dni);
}
