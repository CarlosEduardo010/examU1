package mx.edu.utez.examenU1.controller;
import mx.edu.utez.examenU1.service.iPerson;
import mx.edu.utez.examenU1.model.entity.beanPerson;
import mx.edu.utez.examenU1.model.dto.dtoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControllerPerson {
    @Autowired
    private iPerson personservice;
    @PostMapping("/person")
    public dtoPerson create(@RequestBody dtoPerson dtoPerson){
        beanPerson personsave= personservice.save(dtoPerson);
        return dtoPerson.builder()
                .person_id(personsave.getPerson_id())
                .nombre(personsave.getNombre())
                .ap1(personsave.getAp1())
                .ap2(personsave.getAp2())
                .fech_naci(personsave.getFech_naci())
                .estado_naci(personsave.getEstado_naci())
                .sexo(personsave.getSexo())
                .curp(personsave.getCurp())
                .build();
    }
    /*
    
    */
    @PutMapping("/person")
    public dtoPerson update(@RequestBody dtoPerson dtoPerson){
        beanPerson personundate = personservice.save(dtoPerson);
        return mx.edu.utez.examenU1.model.dto.dtoPerson.builder()
                .person_id(personundate.getPerson_id())
                .nombre(personundate.getNombre())
                .ap1(personundate.getAp1())
                .ap2(personundate.getAp2())
                .fech_naci(personundate.getFech_naci())
                .estado_naci(personundate.getEstado_naci())
                .sexo(personundate.getSexo())
                .curp(personundate.getCurp())
                .build();
    }
    @DeleteMapping("person/{id}")
    public void delete(@PathVariable Integer id){
        beanPerson person = personservice.findById(id);
        personservice.delete(person);
    }
    @GetMapping("person/{id}")
    public beanPerson showById(@PathVariable Integer id){
        return personservice.findById(id);
    }
    @GetMapping("person")
    public List<beanPerson> getPerson(){
        return personservice.findALL();
    }

}
