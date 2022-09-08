package com.ProyectTest;
import com.ProyectTest.Entities.Empleado;
import com.ProyectTest.Entities.Empresa;
import com.ProyectTest.Entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProyectTestApplication.class, args);


		Empleado Alejandro = new Empleado("Alejandro Ule", "alejoule27@gmail.com", "Google", "Operador");
		Empresa Software = new Empresa("Software","Cra 4 # 5B - 16","0180005968","84596214");
		MovimientoDinero Capital = new MovimientoDinero(100000.00,"Consignación","Alejandro Ule");

		System.out.println("INFORMACIÓN EMPLEADO");
		System.out.println("Nombre: " + Alejandro.getNombEmpleado());
		System.out.println("e-mail: " + Alejandro.getCorreoEmpleado());
		System.out.println("Empresa: " + Alejandro.getEmpEmpleado());
		System.out.println("Rol: " + Alejandro.getRolEmpleado());

		System.out.println("\n INFORMACIÓN EMPRESA");
		System.out.println("Empresa: " + Software.getNombEmpresa());
		System.out.println("Dirección: " + Software.getDirEmpresa());
		System.out.println("Teléfono: " + Software.getTelEmpresa());
		System.out.println("Nit: " + Software.getNitEmpresa());

		System.out.println("\n MOVIMIENTOS DINERO");
		System.out.println("Monto: " + Capital.getMonMovimiento());
		System.out.println("Concepto: " + Capital.getConcMovimiento());
		System.out.println("Usuario: " + Capital.getUsuario());
	}

}


