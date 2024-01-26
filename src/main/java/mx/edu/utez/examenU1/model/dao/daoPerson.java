package mx.edu.utez.examenU1.model.dao;
import mx.edu.utez.examenU1.model.entity.beanPerson;
import org.springframework.data.repository.CrudRepository;


public interface daoPerson extends CrudRepository<beanPerson, Integer> {
}
