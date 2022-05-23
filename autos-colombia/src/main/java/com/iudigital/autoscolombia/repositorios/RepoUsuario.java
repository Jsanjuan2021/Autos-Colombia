package com.iudigital.autoscolombia.repositorios;

import com.iudigital.autoscolombia.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RepoUsuario extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUsuarioByUserAndPassword(String user, String password);
    Optional<Usuario> findUsuarioByTipoUsuario(int tipoUsuario);
}
