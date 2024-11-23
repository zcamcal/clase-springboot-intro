package cl.zcamcal.clase.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import cl.zcamcal.clase.controllers.request.JugadorRequest;

@Repository
public class JugadorInMemoryRepository {

  final private Logger logger;
  private List<JugadorRequest> jugadores;

  public JugadorInMemoryRepository() {
    logger = LoggerFactory.getLogger(JugadorInMemoryRepository.class);
    this.jugadores = new ArrayList<>();
  }

  /**
   * TODO: agregar algo para ir filtrando por distintos parametros
   */
  public List<JugadorRequest> filtrar() {
    return jugadores;
  }

  /**
   * TODO: no se le me ocurrio como validar si es que no se encontro la id, como
   * retornar ninguno ;(
   */
  public Optional<JugadorRequest> filtrar(UUID id) {
    List<JugadorRequest> encontrados = jugadores.stream().filter(jugador -> jugador.getId().equals(id))
        .collect(Collectors.toList());

    if (encontrados.size() > 1) {
      logger.warn("Se encontro mas de un jugador bajo el mismo ID, thats weird manito mio");
    }

    return encontrados.stream().findFirst();
  }

  public boolean agregar(JugadorRequest jugador) {
    boolean fueAgregado = this.jugadores.add(jugador);
    return fueAgregado;
  }

  public boolean actualizar(JugadorRequest jugador) {
    boolean eliminado = eliminar(jugador.getId());

    if (!eliminado) {
      return false;
    }

    jugadores.add(jugador);
    return true;
  }

  public boolean eliminar(UUID id) {
    Optional<JugadorRequest> encontrado = filtrar(id);

    if (encontrado.isEmpty()) {
      return false;
    }

    logger.debug("se elimino el jugador: {}", encontrado.get());
    return jugadores.remove(encontrado.get());
  }

}
