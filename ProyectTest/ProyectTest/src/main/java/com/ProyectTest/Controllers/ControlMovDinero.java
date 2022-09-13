package com.ProyectTest.Controllers;

import com.ProyectTest.Entities.MovimientoDinero;
import com.ProyectTest.Services.ServiceMovDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMovDinero {

    ServiceMovDinero SMovDinero = new ServiceMovDinero();
    MovimientoDinero Capital;

    public ControlMovDinero(){
        this.Capital = this.SMovDinero.getCapital();
    }
    @GetMapping("/movimiento-dinero")
    public MovimientoDinero MovimientoDinero(){
        return this.Capital;
    }
}
