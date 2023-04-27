package cl.leo.restapiyoutube.services;

import cl.leo.restapiyoutube.models.Autos;
import cl.leo.restapiyoutube.repositories.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutosService {
    private IAutosRepository autoRepo;

    @Autowired
    public AutosService(IAutosRepository autoRepo) {
        this.autoRepo = autoRepo;
    }

    //Método para crear autos
    public void crearAuto(Autos autos){
        autoRepo.save(autos);
    }
    //Método para listar todos los autos en nuestra BD
    public List<Autos> listarAutos(){
        return autoRepo.findAll();
    }
    //Método para buscar un auto por id específico
    public Optional<Autos> buscarPorId(Long id){
        return autoRepo.findById(id);
    }

    //Método para actualizar un auto
    public void actualizarAuto(Autos auto){
        autoRepo.save(auto);
    }

    //Método para eliminar un auto
    public void eliminarAutoPorId(Long id){
        autoRepo.deleteById(id);
    }

    //Métodos para buscar segun atributos propios de la clase
    public List<Autos> buscarPorMarca(String marca){
        return autoRepo.findByMarca(marca);
    }
    public List<Autos> buscarPorModelo(String modelo){
        return autoRepo.findByModelo(modelo);
    }
    public List<Autos> buscarPorColor(String color){
        return autoRepo.findByColor(color);
    }
    public List<Autos> buscarPorAnio(Long anio){
        return autoRepo.findByAnio(anio);
    }
}
