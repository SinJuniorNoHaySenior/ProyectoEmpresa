package com.ProyectTest.Controllers;

import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {
    /*
        ServiceEmpresa SEmpresa = new ServiceEmpresa();
        Empresa Software;

        public ControlEmpresa(){

            this.Software = this.SEmpresa.getEmpresa();
        }
        @GetMapping("/enterprises")
        public Empresa enterprises(){
            return this.Software;
        }
         // Crear otros métodos y probarlos desde el Postman o Insomnia
        @PostMapping("/enterprises")
        public Empresa crearEmpresa(RequestBody Empresa){
            return this.SEmpresa.getEmpresa();
        }
     */
    ServiceEmpresa SEmpresa;

    public ControlEmpresa(ServiceEmpresa SEmpresa) {
        this.SEmpresa = SEmpresa;
    }

    @GetMapping("/enterprises")
    public List<Empresa> enterprises() {
        return this.SEmpresa.getRepositorio();
    }

    @PostMapping("/enterprises")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.SEmpresa.crearRegistro(emp);
    }
}
