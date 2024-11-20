package cl.zcamcal.clase.controllers;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.zcamcal.clase.dto.EquipoDto;
import cl.zcamcal.clase.dto.JugadorDto;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("jugadores")
public class JugadoresController {

  private List<JugadorDto> jugadores;
  private List<EquipoDto> equipos;

  public JugadoresController() {
    this.jugadores = new ArrayList<>();
    this.equipos = new ArrayList<>();

    EquipoDto losJiJi = new EquipoDto("los jiji");
    EquipoDto sandijuelas = new EquipoDto("sandijuelas");

    this.equipos.add(losJiJi);
    this.equipos.add(sandijuelas);
  }

  @PutMapping(path = "///", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<JugadorDto>>  buscarJugadores(@RequestParam(name = "sandijuela", required = false) String pais) {
    return ResponseEntity.badRequest().build();
  }

  @RequestMapping("")
  public ResponseEntity<JugadorDto> crearJugador(@RequestBody(required = true) JugadorDto jugador) {
    jugador = null;
    this.jugadores.add(jugador);

    if(jugador == null) {
      ResponseEntity.badRequest().build();
    }

    if(jugador.getNombre() == null || jugador.getApellido().equalsIgnoreCase("")){
      ResponseEntity.badRequest().build();
    }

    return ResponseEntity.ok(jugador);
  }

  @PatchMapping(path = "/{jugador}/{equipo}")
  public ResponseEntity<JugadorDto> agregarJugadorAlEquipo(@PathVariable(name = "jugador") String jugador, @PathVariable(name = "equipo") String equipo) {
    //validar que exista jugador 
    //validar que exista equipo 
    JugadorDto jugadorEncontrado = null;
    jugadorEncontrado.setEquipo(jugador);

    EquipoDto equipoEncontrado = null;

    return ResponseEntity.ok(null);
  }

}
