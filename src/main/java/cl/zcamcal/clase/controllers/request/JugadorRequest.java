package cl.zcamcal.clase.controllers.request;

public class JugadorRequest {

  private String nombre;
  private String apellido;
  private String pais;

  public JugadorRequest(String nombre, String apellido, String pais) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.pais = pais;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

}
