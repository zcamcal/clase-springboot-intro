package cl.zcamcal.clase.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(allowGetters = false)
public class JugadorDto {

  @JsonProperty("nombre")
  private String nombre;

  @JsonProperty("apellido")
  private String apellido;

  @JsonProperty("pais")
  private String pais;

  @JsonProperty("equipito")
  private String equipo;

  @JsonProperty("posicion")
  private String posicion;

  public JugadorDto() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return null;
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

  public String getEquipo() {
    return equipo;
  }

  @JsonSetter(value = "equpazo")
  public void setEquipo(String equipo) {
    this.equipo = equipo;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

}
