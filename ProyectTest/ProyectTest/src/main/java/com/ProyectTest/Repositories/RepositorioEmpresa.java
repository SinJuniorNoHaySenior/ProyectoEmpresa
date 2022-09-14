package com.ProyectTest.Repositories;

import com.ProyectTest.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositorioEmpresa extends JpaRepository<Empresa, Long> {
}
