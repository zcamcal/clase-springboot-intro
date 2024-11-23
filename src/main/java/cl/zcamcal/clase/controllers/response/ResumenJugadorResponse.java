package cl.zcamcal.clase.controllers.response;

import java.util.UUID;

public class ResumenJugadorResponse {

  private UUID id;

  private String nombre;

  private String camiseta;
  private EquipoJugadorResponse equipo;

  public ResumenJugadorResponse() {
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

  public String getCamiseta() {
    return camiseta;
  }

  public void setCamiseta(String camiseta) {
    this.camiseta = camiseta;
  }

  public EquipoJugadorResponse getEquipo() {
    return equipo;
  }

  public void setEquipo(EquipoJugadorResponse equipo) {
    this.equipo = equipo;
  }

}
