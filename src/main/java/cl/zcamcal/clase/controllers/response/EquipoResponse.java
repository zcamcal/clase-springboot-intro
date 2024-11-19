package cl.zcamcal.clase.controllers.response;

import java.util.List;

public class EquipoResponse {

  private String nombre;
  private List<?> jugadores;

  public EquipoResponse(String nombre, List<?> jugadores) {
    this.nombre = nombre;
    this.jugadores = jugadores;
  }

}
