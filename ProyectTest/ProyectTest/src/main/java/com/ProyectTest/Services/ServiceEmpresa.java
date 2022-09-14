package com.ProyectTest.Services;

import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Repositories.RepositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceEmpresa {
/*
    Empresa Software;
    ServiceEmpleado SEmpleado = new ServiceEmpleado();
    public ServiceEmpresa(){

        Empleado Alejandro = this.SEmpleado.getEmpleado();

        this.Software = new Empresa("Software","Cra 4 # 5B - 16",
                "0180005968","84596214");
    }
    public Empresa getEmpresa(){
        return this.Software;

    }
 */
    private RepositorioEmpresa repositorio;
    public ServiceEmpresa(RepositorioEmpresa repositorio){
        this.repositorio = repositorio;
    }

    public List<Empresa> getRepositorio(){
        return this.repositorio.findAll();
    }

    public Empresa crearRegistro(Empresa empresa1){
        return this.repositorio.save(empresa1);
    }
}
