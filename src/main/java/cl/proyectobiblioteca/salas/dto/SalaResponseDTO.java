package cl.proyectobiblioteca.salas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaResponseDTO {
    private Long id;
    private String nombreSala;
    private Integer capacidad;
}
