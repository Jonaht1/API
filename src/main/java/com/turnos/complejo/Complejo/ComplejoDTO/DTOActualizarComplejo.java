package com.turnos.complejo.Complejo.ComplejoDTO;

import jakarta.validation.constraints.NotNull;

public record DTOActualizarComplejo(@NotNull Long idComplejo, String nombre, String apellido,
                                    String email, Integer tel, Integer cantCanchas, String especialidad){

}
