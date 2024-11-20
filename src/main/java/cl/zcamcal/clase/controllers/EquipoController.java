package cl.zcamcal.clase.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.zcamcal.clase.dto.EquipoDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("jugadores")
public class EquipoController {

  private List<EquipoDto> equipos;

  public EquipoController() {
    this.equipos = new ArrayList<>();

    EquipoDto losJiJi = new EquipoDto("los jiji");
    EquipoDto sandijuelas = new EquipoDto("sandijuelas");

    this.equipos.add(losJiJi);
    this.equipos.add(sandijuelas);
  }

  @GetMapping(path = "{jugador}", consumes = MediaType.ALL_VALUE, produces = MediaType.TEXT_XML_VALUE)
  public ResponseEntity<EquipoDto>  buscarPais(@PathVariable(name = "jugador", required = false) String alawaselomacho) {
    return ResponseEntity.badRequest().build();
  }

}
