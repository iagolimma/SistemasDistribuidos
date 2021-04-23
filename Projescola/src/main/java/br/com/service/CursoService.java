package br.com.service;
import br.com.model.Curso;
import br.com.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public void  save(Curso curso) {
        cursoRepository.save(curso);
    }

    public List<Curso> findAll () {
        return cursoRepository.findAll();
    }

    public Optional<Curso> findById(String id){
        return cursoRepository.findById(id);
    }

    public  void delete(String id){
        cursoRepository.deleteById(id);
    }

}
