package br.com.service;

import br.com.model.Aluno;
import br.com.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void  save(Aluno aluno) {
         alunoRepository.save(aluno);
    }

    public List<Aluno> findAll () {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(String id){
        return alunoRepository.findById(id);
    }

    public  void delete(String id){
        alunoRepository.deleteById(id);
    }

}
