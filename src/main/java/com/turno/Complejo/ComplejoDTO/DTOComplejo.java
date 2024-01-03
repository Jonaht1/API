package com.turno.Complejo.ComplejoDTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;




@Builder
public record DTOComplejo(@NotNull Long idComplejo, String nombre, String apellido,
                          String email, Integer tel, Integer cantCanchas, String especialidad){


    public Long getIdComplejo() {
        return null;
    }

    public String getApellido() {
        return null;
    }

    public String getNombre() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    public Integer getTel() {
        return null;
    }

    public Integer getCantCanchas() {
        return null;
    }

    public String getEspecialidad()
    { return null;
    }
}
