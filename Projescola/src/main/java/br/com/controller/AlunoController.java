package br.com.controller;
import br.com.constant.Constant;
import br.com.model.Aluno;
import br.com.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping(Constant.API_ALUNO)
    public void save(@RequestBody Aluno aluno){
        alunoService.save(aluno);
    }

    @GetMapping(Constant.API_ALUNO)
    public List<Aluno> findALL(){
        return alunoService.findAll();
    }

    @PutMapping(Constant.API_ALUNO)
    public void update(@RequestBody Aluno aluno){
        alunoService.save(aluno);
    }

    @DeleteMapping(Constant.API_ALUNO + "/{id}")
    public void delete(@PathVariable("id") String id){
        alunoService.delete(id);
    }

    @GetMapping(Constant.API_ALUNO + "/{id}")
    public Optional<Aluno> findById(@PathVariable("id") String id){
        return alunoService.findById(id);
    }
}
