package br.com.service;
import br.com.model.Materia;
import br.com.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public void  save(Materia materia) {
        materiaRepository.save(materia);
    }

    public List<Materia> findAll () {
        return materiaRepository.findAll();
    }

    public Optional<Materia> findById(String id){
        return materiaRepository.findById(id);
    }

    public  void delete(String id){
        materiaRepository.deleteById(id);
    }

}
