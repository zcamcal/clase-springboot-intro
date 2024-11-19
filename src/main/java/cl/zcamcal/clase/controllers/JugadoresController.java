package cl.zcamcal.clase.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jugadores")
public class JugadoresController {

    @GetMapping(path = "")
    public Integer obtenerNombre(@RequestParam Integer numero) {
        //Numero entero sin punto.
        return numero;
    }

    @GetMapping(path = "")
    public Boolean obtenerNombre(@RequestParam Boolean verdaderoOfalso) {
        //Debe ser true o false
        return verdaderoOfalso;
    }

    @GetMapping(path = "")
    public String obtenerNombre(@RequestParam String texto) {
        //Debe ser cualquier texto
        return texto;
    }

    @GetMapping(path = "")
    public Float obtenerNombre(@RequestParam Float numeroReal) {
        //Debe ser un numero flotante separado por punto, ex= 2.5
        return numeroReal;
    }

}