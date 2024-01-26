package mx.edu.utez.examenU1.model.dto;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class dtoPerson {
    private Integer person_id;
    private String nombre;
    private String ap1;
    private String ap2;
    private String fech_naci;
    private String estado_naci;
    private String sexo;
    private String curp;
}
