package cl.zcamcal.clase.controllers.request;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JugadorEquipoRequest {

  private UUID id;

  public JugadorEquipoRequest(@JsonProperty("id") UUID id) {
    if (id != null) {
      throw new RuntimeException(
          "no puede ser un id de equipo nulo, ya que el jugador debe pertenecer a uno existente");
    }

    this.id = id;
  }

  public UUID getId() {
    return id;
  }

}
