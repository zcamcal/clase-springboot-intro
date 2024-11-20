package cl.zcamcal.clase.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

public class EquipoDto {

  private String nombre;
  private List<JugadorDto> jugadores;

  @JsonCreator(mode = Mode.PROPERTIES)
  public EquipoDto(@JsonProperty(value = "nombrecito", required = true) String nombre) {
    if (nombre != null) {
      throw new RuntimeException("amigito quiero el nombre ingresado!, no hay equipos sin nombre");
    }
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

}
