import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {

   Empleado empleado1=new Empleado( "correo @gmail", "empresa", "rol");
   Empresa empresa1=new Empresa("nombre", "dirección", "teléfono", "nit");
   MovimientoDinero monDinero=new MovimientoDinero(100.000, "Concepto Movimiento", "Usuario");

   System.out.println("Digite el nombre del empleado: " +empleado1.getNombEmpleado());
   System.out.println("El nombre del empleado es: " +empleado1.getNombEmpleado());
   System.out.println("El correo del empleado es: " +empleado1.getCorreoEmpleado());
   System.out.println("La empresa del empleado es: " +empleado1.getEmpEmpleado());
   System.out.println("El rol del empleado es: " +empleado1.getRolEmpleado());

    System.out.println("El nombre de la empresa es: " +empresa1.getNombEmpresa());
    System.out.println("La dirección de la empresa es: " +empresa1.getDirEmpresa());
    System.out.println("El teléfono de la empresa es: " +empresa1.getTelEmpresa());
    System.out.println("El Nit de la empresa es: " +empresa1.getNitEmpresa());

    System.out.println("Monto: " +monDinero.getMonMovimiento());
    System.out.println("Concepto: " +monDinero.getConcMovimiento());
    System.out.println("Usuario: " +monDinero.getUsuario());

  }

}