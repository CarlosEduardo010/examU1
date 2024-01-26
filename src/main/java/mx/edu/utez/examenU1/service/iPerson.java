package mx.edu.utez.examenU1.service;
import mx.edu.utez.examenU1.model.entity.beanPerson;
import mx.edu.utez.examenU1.model.dto.dtoPerson;
import java.util.List;
public interface iPerson {
    beanPerson save(dtoPerson dtoPerson);
    beanPerson findById(Integer id);
    void delete(beanPerson beanPerson);
    List<beanPerson> findALL();
}
