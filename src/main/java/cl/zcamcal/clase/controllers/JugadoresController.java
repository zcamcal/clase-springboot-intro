package cl.zcamcal.clase.controllers;

import org.springframework.http.ResponseEntity;

import cl.zcamcal.clase.controllers.request.JugadorRequest;
import cl.zcamcal.clase.controllers.response.ResumenJugadorResponse;
import cl.zcamcal.clase.repository.JugadorInMemoryRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jugadores")
public class JugadoresController {

  private JugadorInMemoryRepository repository;

  public JugadoresController(JugadorInMemoryRepository repository) {
    this.repository = repository;
  }

  //TODO: tengo problemas al retornar los jugadores creados se ven vacios ;(
  @GetMapping(path = "")
  public ResponseEntity<List<ResumenJugadorResponse>>  buscarJugadores() {
    List<JugadorRequest> jugadores = repository.filtrar();

    List<ResumenJugadorResponse> transformed = jugadores.stream().map(jugador -> {
      ResumenJugadorResponse response = new ResumenJugadorResponse();

      return response;
    }).collect(Collectors.toList());

    return ResponseEntity.ok(transformed);
  }

  //TODO: esta creando bien sin embargo no valida que no sean vacios los textos
  @PostMapping(path = "")
  public ResponseEntity<JugadorRequest> crear(@RequestBody JugadorRequest jugador) {
    this.repository.agregar(jugador);
    return ResponseEntity.ok(jugador);
  }

}
