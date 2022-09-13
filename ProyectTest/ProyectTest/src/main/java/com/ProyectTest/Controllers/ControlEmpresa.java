package com.ProyectTest.Controllers;

import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {

    ServiceEmpresa SEmpresa = new ServiceEmpresa();
    Empresa Software;

    public ControlEmpresa(){
        this.Software = this.SEmpresa.getEmpresa();
    }

    @GetMapping("/informacion-empresa")
    public Empresa InformacionEmpresa(){
         return this.Software;
    }
     // Crear otros métodos y probarlos desde el Postman o Insomnia
}
