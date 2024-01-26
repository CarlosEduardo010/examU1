package mx.edu.utez.examenU1.service.impl;
import lombok.AllArgsConstructor;
import mx.edu.utez.examenU1.model.dto.dtoPerson;
import mx.edu.utez.examenU1.model.entity.beanPerson;
import mx.edu.utez.examenU1.model.dao.daoPerson;
import mx.edu.utez.examenU1.service.iPerson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class Implperson implements iPerson{
    private final daoPerson daoPerson;

    @Transactional
    @Override
    public beanPerson save(dtoPerson dtoPerson) {
        beanPerson person = beanPerson.builder()
                .person_id(dtoPerson.getPerson_id())
                .nombre(dtoPerson.getNombre())
                .ap1(dtoPerson.getAp1())
                .ap2(dtoPerson.getAp2())
                .fech_naci(dtoPerson.getFech_naci())
                .estado_naci(dtoPerson.getEstado_naci())
                .sexo(dtoPerson.getSexo())
                .curp(dtoPerson.getCurp())
                .build();
        return daoPerson.save(person);
    }

    @Override
    public beanPerson findById(Integer id) {
        return daoPerson.findById(id).orElse(null );
    }


    @Override
    public void delete(beanPerson person) {
        daoPerson.delete(person);
    }

    @Override
    public List<beanPerson> findALL() {
        return (List<beanPerson>) daoPerson.findAll();
    }
}
