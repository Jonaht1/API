package com.turnos.Hello.Complejo;

public record DatosRespuestaComplejo(Long idComplejo, String nombre, String apellido,
                                     String email, Integer tel, Integer cantCanchas, String especialidad){


    public DatosRespuestaComplejo(Complejo complejo){
        this(complejo.getIdComplejo(),
                complejo.getNombre(),
                complejo.getApellido(),
                complejo.getEmail(), complejo.getTel(), complejo.getCantCanchas(), complejo.getEspecialidad());
    }


}
