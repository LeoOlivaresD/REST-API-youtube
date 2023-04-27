package cl.leo.restapiyoutube.controllers;

import cl.leo.restapiyoutube.models.Autos;
import cl.leo.restapiyoutube.services.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos/")
public class AutoRestController {
    private AutosService autoService;

    @Autowired
    public AutoRestController(AutosService autoService) {
        this.autoService = autoService;
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Autos autos) {
        autoService.crearAuto(autos);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Autos> listarAutos() {
        return autoService.listarAutos();
    }

    @GetMapping(value = "listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Autos> buscarPorId(@PathVariable Long id) {
        return autoService.buscarPorId(id);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Autos autos) {
        autoService.actualizarAuto(autos);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id) {
        autoService.eliminarAutoPorId(id);
    }

    @GetMapping(value = "listarPorMarca/{marca}", headers = "Accept=application/json")
    public List<Autos> listarPorMarca(@PathVariable String marca) {
        return autoService.buscarPorMarca(marca);
    }

    @GetMapping(value = "listarPorModelo/{modelo}", headers = "Accept=application/json")
    public List<Autos> listarPorModelo(@PathVariable String modelo) {
        return autoService.buscarPorModelo(modelo);
    }

    @GetMapping(value = "listarPorColor/{color}", headers = "Accept=application/json")
    public List<Autos> listarPorColor(@PathVariable String color) {
        return autoService.buscarPorColor(color);
    }

    @GetMapping(value = "listarPorAnio/{anio}", headers = "Accept=application/json")
    public List<Autos> listarPorAnio(@PathVariable Long anio) {
        return autoService.buscarPorAnio(anio);
    }
}
