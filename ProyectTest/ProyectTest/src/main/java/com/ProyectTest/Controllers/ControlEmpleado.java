package com.ProyectTest.Controllers;

import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Services.ServiceEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpleado {

    ServiceEmpleado SEmpleado = new ServiceEmpleado();
    Empleado Alejandro;

    public ControlEmpleado(){
        this.Alejandro = this.SEmpleado.getEmpleado();
    }
    @GetMapping("/InformacionEmpleado")
    public Empleado InformacionEmpleado(){
        return this.Alejandro;
    }
}
