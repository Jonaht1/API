package com.turnos.complejo.CanchaComplejo;

import com.turnos.complejo.Complejo.Entidad.Complejo;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Canchas {


    private Long  idCancha;


    private String nombre;
    private Boolean tipoCancha; // 1 I n 0 Out

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Complejo_id")
    private Complejo complejo;

    

}
