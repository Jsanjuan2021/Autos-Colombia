package com.iudigital.autoscolombia.servicios;

import com.iudigital.autoscolombia.modelo.Tercero;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ServicioTercero {
    public List<Tercero> getTerceros();
    Optional<Tercero> getTerceroDni(Long dni);
    public Tercero saveTercero(Tercero t);
    public Tercero updateTercero(Tercero t);
}
