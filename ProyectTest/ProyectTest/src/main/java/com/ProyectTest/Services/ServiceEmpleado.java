package com.ProyectTest.Services;
import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Repositories.RepositorioEmpleado;
import com.ProyectTest.Repositories.RepositorioEmpresa;

import java.util.List;

public class ServiceEmpleado {

    Empleado Alejandro;

    public ServiceEmpleado(){
        this.Alejandro = new Empleado("Alejandro Ule", "alejoule27@gmail.com",
                "Google", "Operador");
    }

    public Empleado getEmpleado(){
        return this.Alejandro;
    }


}
