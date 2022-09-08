package com.ProyectTest.Services;

import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Entities.Empresa;

public class ServiceEmpresa {

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
}
