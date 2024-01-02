package com.turnos.complejo.Complejo.Service;

import com.turnos.complejo.Complejo.Entidad.Complejo;

import java.util.List;
import java.util.Optional;


public interface IComplejoService{

        List<Complejo> findAll();
        Optional<Complejo> findById(Long id);
        void save(Complejo complejo);
        void deleteById(Long id);
        }


