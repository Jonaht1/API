package com.turno.Complejo.Persistencia;

import com.turno.Complejo.Entidad.Complejo;

import java.util.List;
import java.util.Optional;

public interface IComplejoDAO {

    List<Complejo> findAll();
    Optional<Complejo> finadById(Long id);
    void save(Complejo complejo);
    void deleteById(Long id);
    }
