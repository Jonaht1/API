package com.turnos.complejo.Complejo.ComplejoDTO;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

public record DatosRespuestaComplejo(Long idComplejo, String nombre, String apellido,
                                     String email, Integer tel, Integer cantCanchas, String especialidad){


    /*public DatosRespuestaComplejo(Complejo complejo){
        this(complejo.getIdComplejo(),
                complejo.getNombre(),
                complejo.getApellido(),
                complejo.getEmail(), complejo.getTel(), complejo.getCantCanchas(), complejo.getEspecialidad());
    }*/


}
