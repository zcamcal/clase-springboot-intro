package cl.zcamcal.clase.controllers.request;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

public class JugadorRequest {

  private UUID id;
  private String nombre;
  private String apellido;
  private String pais;
  private String posicion;

  @JsonCreator(mode = Mode.PROPERTIES)
  public JugadorRequest(
      @JsonProperty(value = "nombre", required = true) String nombre,
      @JsonProperty(value = "apellido", required = true) String apellido,
      @JsonProperty(value = "pais", required = true) String pais,
      @JsonProperty(value = "posicion", required = true) String posicion) {
    this.id = UUID.randomUUID();
    this.nombre = nombre;
    this.apellido = apellido;
    this.pais = pais;

    //TODO: validar que las posiciones ingresadas sean una de las siguientes: delantero, arquero, medianero, trasero 
    this.posicion = posicion;
  }

  public UUID getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getPais() {
    return pais;
  }

  public String getPosicion() {
    return posicion;
  }

}
