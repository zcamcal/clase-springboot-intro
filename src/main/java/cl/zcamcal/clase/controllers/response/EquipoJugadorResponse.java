package cl.zcamcal.clase.controllers.response;

import java.util.UUID;

public class EquipoJugadorResponse {

  private UUID id;
  private String nombre;

  public EquipoJugadorResponse() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

}
