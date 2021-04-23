package br.com.repository;
import br.com.model.Materia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends MongoRepository<Materia, String> {
}