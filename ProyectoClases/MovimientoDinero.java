public class MovimientoDinero{
  private Double monMovimiento;
  private String concMovimiento="";
  private String usuario="";

  public MovimientoDinero(Double monMovimiento, String concMovimiento, String usuario) {
    this.monMovimiento = monMovimiento;
    this.concMovimiento = concMovimiento;
    this.usuario = usuario;
  }

  public Double getMonMovimiento() {
    return monMovimiento;
  }

  public void setMonMovimiento(Double monMovimiento) {
    this.monMovimiento = monMovimiento;
  }

  public String getConcMovimiento() {
    return concMovimiento;
  }

  public void setConcMovimiento(String concMovimiento) {
    this.concMovimiento = concMovimiento;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }
}