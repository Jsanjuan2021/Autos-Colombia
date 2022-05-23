package com.iudigital.autoscolombia.repositorios;

import com.iudigital.autoscolombia.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RepoVehiculo extends JpaRepository<Vehiculo, String> {

    Optional<Vehiculo> findVehiculoByUsuario(int idUsuario);
}
