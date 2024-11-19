package cl.zcamcal.clase.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


  @GetMapping("/sumar")
  public ResponseEntity<Integer> sumar(@RequestParam(name = "a") Integer b) {
      return ResponseEntity.ok(b);
  }

  public void restar() {

  }

}
