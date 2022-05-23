package com.iudigital.autoscolombia.servicios;


import com.iudigital.autoscolombia.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface SercivioUsuario {
    public List<Usuario> getUsuarios();
    Optional<Usuario> getUsuarioId(Long id);
    public Usuario saveUsuario(Usuario u);
    public Usuario updateUsuario(Usuario u);
}
