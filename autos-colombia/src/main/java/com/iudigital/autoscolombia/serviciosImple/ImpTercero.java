package com.iudigital.autoscolombia.serviciosImple;

import com.iudigital.autoscolombia.modelo.Tercero;
import com.iudigital.autoscolombia.repositorios.RepoTercero;
import com.iudigital.autoscolombia.servicios.ServicioTercero;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ImpTercero implements ServicioTercero {

    private RepoTercero repoTercero;

    @Override
    public List<Tercero> getTerceros() {
        return repoTercero.findAll();
    }

    @Override
    public Optional<Tercero> getTerceroDni(Long dni) {
        if (!repoTercero.existsById(dni)){
            new Throwable("DNI no existe...");
        }
        return repoTercero.findById(dni);
    }

    @Override
    public Tercero saveTercero(Tercero t) {
        if (repoTercero.existsById(t.getDni())){
            new Throwable("El tercero ya existe en la base de datos");
        }
        return repoTercero.save(t);
    }

    @Override
    public Tercero updateTercero(Tercero t) {
        Optional<Tercero> tercero = repoTercero.findById(t.getDni());
        if (!tercero.isPresent()){
            new Throwable("El tercero no existe en la base de datos");
        }
        return repoTercero.save(t);
    }
}
