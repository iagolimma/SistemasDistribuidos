package br.com.controller;
import br.com.constant.Constant;
import br.com.model.Materia;;
import br.com.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping(Constant.API_MATERIA)
    public void save(@RequestBody Materia materia){
        materiaService.save(materia);
    }

    @GetMapping(Constant.API_MATERIA)
    public List<Materia> findALL(){
        return materiaService.findAll();
    }

    @PutMapping(Constant.API_MATERIA)
    public void update(@RequestBody Materia materia){
        materiaService.save(materia);
    }

    @DeleteMapping(Constant.API_MATERIA + "/{id}")
    public void delete(@PathVariable("id") String id){
        materiaService.delete(id);
    }

    @GetMapping(Constant.API_MATERIA + "/{id}")
    public Optional<Materia> findById(@PathVariable("id") String id){
        return materiaService.findById(id);
    }
}
