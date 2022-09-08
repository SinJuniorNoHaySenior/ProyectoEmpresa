package com.ProyectTest.Services;
import com.ProyectTest.Entities.MovimientoDinero;

public class ServiceMovDinero {

    MovimientoDinero Capital;

    public ServiceMovDinero(){
        this.Capital = new MovimientoDinero(100000.00,"Consignación",
                "Alejandro Ule");
    }
    public MovimientoDinero getCapital(){
        return this.Capital;
    }

}
