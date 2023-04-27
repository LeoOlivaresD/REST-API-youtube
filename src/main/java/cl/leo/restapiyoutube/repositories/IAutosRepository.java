package cl.leo.restapiyoutube.repositories;
import cl.leo.restapiyoutube.models.Autos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutosRepository extends JpaRepository<Autos, Long> {
    List<Autos> findByMarca(String marca);
    List<Autos> findByColor(String color);
    List<Autos> findByModelo(String modelo);
    List<Autos> findByAnio(Long anio);
}
