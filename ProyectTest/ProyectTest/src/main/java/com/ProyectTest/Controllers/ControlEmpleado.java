package com.ProyectTest.Controllers;

import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Services.ServiceEmpleado;
import com.ProyectTest.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpleado {

    ServiceEmpleado SEmpleado = new ServiceEmpleado();
    Empleado Alejandro;

    public ControlEmpleado(){

        this.Alejandro = this.SEmpleado.getEmpleado();
    }


    @GetMapping("/users")
    public Empleado users(){

        return this.Alejandro;
    }


}
