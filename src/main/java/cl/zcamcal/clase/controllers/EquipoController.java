package cl.zcamcal.clase.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.zcamcal.clase.controllers.request.JugadorRequest;
import cl.zcamcal.clase.controllers.response.EquipoResponse;
import cl.zcamcal.clase.repository.JugadorInMemoryRepository;

import java.util.Optional;

@RestController
@RequestMapping("equipos")
public class EquipoController {

  private JugadorInMemoryRepository repository;

  public EquipoController(JugadorInMemoryRepository repository) {
    this.repository = repository;
  }

  //
  /**
   * TODO: necesitamos hacer funcionar este endpoint, recibe el id del equipo y el id del jugador, debemos:
   * - validar que el equipo exista, en caso que no exista entonces un 404.
   * - validar que el jugador exista, en caso que no entonces un 400
   * - si el jugador ya posee un equipo, dejaremos un log de warning informando que se trato de asignar al jugador a otro equipo ademas retornaremos un 401
   * - 
   */
  @PatchMapping(path = "{equipo}/jugadores/{jugador}")
  public ResponseEntity<EquipoResponse> agregarJugador() {
    Optional<JugadorRequest> jugadorEncontrado = repository.filtrar(null);
    
    return ResponseEntity.ok(null);
  }

  public ResponseEntity<EquipoResponse> eliminarJugador(@RequestHeader(name = "equipo-solicitante") String equipoSolicitador) {
    //validar que exista el equipo que llegara en el path y obtenerlo
    //validar el id del equipo obtenido con el id de la cabecera, si no son iguales retornar un 401
    //logear en nivel warning que se elimino tal id de jugador de tal id del equipo
    //eliminar al jugador del equipo
    //retornar el equipo actualizado

    return null;
  }

}
