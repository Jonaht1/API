package com.turno.Complejo.ComplejoDTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOComplejoUno
{
    private Long idComplejo;
    private String nombre;
    private String apellido;
    private String email;
    private Integer tel;
    private Integer cantCanchas;
    private String especialidad;


}
