import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    String nombreUsuario;
    System.out.print("Nombre del usuario: ");
    nombreUsuario = entrada.nextLine();
    System.out.println("El nombre es: " + nombreUsuario);


    Empleado Alejandro = new Empleado(nombreUsuario, "alejoule27@gmail.com","Google","Operador");
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