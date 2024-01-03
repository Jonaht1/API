package com.turno.Complejo.Entidad;


import com.turno.Complejo.ComplejoDTO.DTOComplejo;
import com.turno.Complejo.ComplejoDTO.DatosRespuestaComplejo;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "complejo")
@Entity(name = "Complejo")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Complejo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idComplejo;
    private String nombre;
    private String apellido;
    private String email;
    private Integer tel;
    private Integer cantCanchas;
    private String especialidad;

    public Complejo(String nombre, String apellido, String email, Integer tel, Integer cantCanchas, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tel = tel;
        this.cantCanchas = cantCanchas;
        this.especialidad = especialidad;
    }


    public Complejo(DatosRespuestaComplejo datosRespuestaComplejo) {
        this.nombre = datosRespuestaComplejo.nombre();
        this.apellido = datosRespuestaComplejo.apellido();
        this.email = datosRespuestaComplejo.email();
        this.tel = datosRespuestaComplejo.tel();
        this.cantCanchas = datosRespuestaComplejo.cantCanchas();
        this.especialidad = datosRespuestaComplejo.especialidad();
        
    }

    public void actualizarDatos(DTOComplejo dtoActualizarComplejo){
        if (dtoActualizarComplejo.nombre() != null){
            this.nombre=dtoActualizarComplejo.nombre();
        }
        if (dtoActualizarComplejo.apellido() != null){
            this.apellido=dtoActualizarComplejo.apellido();
        }
        if (dtoActualizarComplejo.email() != null){
            this.email=dtoActualizarComplejo.email();
        }
        if (dtoActualizarComplejo.tel() != null){
            this.tel=dtoActualizarComplejo.tel();
        }
        if (dtoActualizarComplejo.cantCanchas() != null) {
            this.cantCanchas=dtoActualizarComplejo.cantCanchas();
        }
        if (dtoActualizarComplejo.especialidad() != null){
            this.especialidad=dtoActualizarComplejo.especialidad();
        }


    }

}



