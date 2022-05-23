package com.iudigital.autoscolombia.serviciosImple;

import com.iudigital.autoscolombia.modelo.Usuario;
import com.iudigital.autoscolombia.repositorios.RepoUsuario;
import com.iudigital.autoscolombia.servicios.SercivioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @AllArgsConstructor
public class impUsuario implements SercivioUsuario {

    private RepoUsuario repoUsuario ;

    @Override
    public List<Usuario> getUsuarios() {
        return repoUsuario.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioId(Long id) {
        Optional<Usuario> u = repoUsuario.findById(id);
        if (!u.isPresent()){
            new Throwable("DNI no existe...");
        }
        return u;
    }

    @Override
    public Usuario saveUsuario(Usuario u) {
        return repoUsuario.save(u);
    }

    @Override
    public Usuario updateUsuario(Usuario u) {
        Optional<Usuario> usuario = repoUsuario.findById(u.getId());
        if (!usuario.isPresent()){
            new Throwable("El usuario no existe en la base de datos");
        }
        return repoUsuario.save(u);
    }
}
