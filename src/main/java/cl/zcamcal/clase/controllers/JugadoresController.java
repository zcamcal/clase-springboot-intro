package cl.zcamcal.clase.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("jugadores")
public class JugadoresController {

  @GetMapping(path = "numero", produces = MediaType.TEXT_PLAIN_VALUE)
  public ResponseEntity<String> obtenerNmero(@RequestParam Integer numero) {
    // Numero entero sin punto.
    return ResponseEntity.internalServerError().body("ha");
  }

  @GetMapping(path = "boolean")
  public Boolean obtenerNombre(@RequestParam Boolean verdaderoOfalso) {
    // Debe ser true o false
    return verdaderoOfalso;
  }

  @GetMapping(path = "map")
  public Map<String, Integer> obtenerMap(@RequestParam String texto) {
    Map<String, Integer> algo = new HashMap<>();
    algo.put("llave", 2);

    return algo;
  }

  @GetMapping(path = "numeroReal")
  public ResponseEntity<Response> obtenerReal(@RequestParam Float numeroReal) {
    // Debe ser un numero flotante separado por punto, ex= 2.5
    Response responseInner = new Response();
    responseInner.setData(5);
    responseInner.setSuccess(true);

    Response response = new Response();
    response.setData(responseInner);
    response.setSuccess(true);

    return ResponseEntity.status(399).body(response);
  }

}

class Response {

  private boolean success;

  private Object data;

  public Response(){}

  public boolean getSuccess(){
    return this.success;
  }

  public Object getData(){
    return this.data;
  }

  public void setData(Object data) {
    this.data  = data;
  }
 
  public void setSuccess(boolean success) {
    this.success  = success;
  } 
}
