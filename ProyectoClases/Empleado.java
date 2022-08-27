public class Empleado{
  private String nombEmpleado = "" ;
  private String correoEmpleado = "" ;
  private String empEmpleado = "" ;
  private String rolEmpleado = "" ;

  public Empleado(String nombEmpleado, String correoEmpleado, String empEmpleado, String rolEmpleado) {
    this.nombEmpleado = nombEmpleado;
    this.correoEmpleado = correoEmpleado;
    this.empEmpleado = empEmpleado;
    this.rolEmpleado = rolEmpleado;
  }

  public String getNombEmpleado() {
    return nombEmpleado;
  }

  public void setNombEmpleado(String nombEmpleado) {
    this.nombEmpleado = nombEmpleado;
  }

  public String getCorreoEmpleado() {
    return correoEmpleado;
  }

  public void setCorreoEmpleado(String correoEmpleado) {
    this.correoEmpleado = correoEmpleado;
  }

  public String getEmpEmpleado() {
    return empEmpleado;
  }

  public void setEmpEmpleado(String empEmpleado) {
    this.empEmpleado = empEmpleado;
  }

  public String getRolEmpleado() {
    return rolEmpleado;
  }

  public void setRolEmpleado(String rolEmpleado) {
    this.rolEmpleado = rolEmpleado;
  }
}