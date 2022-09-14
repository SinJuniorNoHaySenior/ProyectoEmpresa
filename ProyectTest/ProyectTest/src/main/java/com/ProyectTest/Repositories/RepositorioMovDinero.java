package com.ProyectTest.Repositories;

import com.ProyectTest.Entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMovDinero extends JpaRepository<MovimientoDinero, Long> {
}
