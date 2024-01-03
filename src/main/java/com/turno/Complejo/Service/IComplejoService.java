package com.turno.Complejo.Service;

import com.turno.Complejo.Entidad.Complejo;

import java.util.List;
import java.util.Optional;


public interface IComplejoService {

        List<Complejo> findAll();

        Optional<Complejo> finadById(Long id);

        void save(Complejo complejo);

        void deleteById(Long id);
}


