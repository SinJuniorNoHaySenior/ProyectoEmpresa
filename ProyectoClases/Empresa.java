public class Empresa{
  private String nombEmpresa="";
  private String dirEmpresa="";
  private String telEmpresa;
  private String nitEmpresa;

  public Empresa(String nombEmpresa, String dirEmpresa, String telEmpresa, String nitEmpresa) {
    this.nombEmpresa = nombEmpresa;
    this.dirEmpresa = dirEmpresa;
    this.telEmpresa = telEmpresa;
    this.nitEmpresa = nitEmpresa;
  }

  public String getNombEmpresa() {
    return nombEmpresa;
  }

  public void setNombEmpresa(String nombEmpresa) {
    this.nombEmpresa = nombEmpresa;
  }

  public String getDirEmpresa() {
    return dirEmpresa;
  }

  public void setDirEmpresa(String dirEmpresa) {
    this.dirEmpresa = dirEmpresa;
  }

  public String getTelEmpresa() {
    return telEmpresa;
  }

  public void setTelEmpresa(String telEmpresa) {
    this.telEmpresa = telEmpresa;
  }

  public String getNitEmpresa() {
    return nitEmpresa;
  }

  public void setNitEmpresa(String nitEmpresa) {
    this.nitEmpresa = nitEmpresa;
  }
}