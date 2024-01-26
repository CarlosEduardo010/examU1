package mx.edu.utez.examenU1.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "Person")
public class beanPerson {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ap1")
    private String ap1;
    @Column(name = "ap2")
    private String ap2;
    @Column(name = "fech_naci")
    private String fech_naci;
    @Column(name = "estado_naci")
    private String estado_naci;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "curp")
    private String curp;

}
