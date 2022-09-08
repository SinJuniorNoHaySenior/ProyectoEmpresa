package com.ProyectTest.Services;
import com.ProyectTest.Entities.Empleado;

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
