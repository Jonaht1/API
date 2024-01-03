package com.turno.Complejo.Persistencia.Impl;

import com.turno.Complejo.Entidad.Complejo;
import com.turno.Complejo.Repository.ComplejoRepository;
import com.turno.Complejo.Persistencia.IComplejoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ComplejoDAOImpl implements IComplejoDAO {
    @Autowired
    private ComplejoRepository complejoRepository;

    @Override
    public List<Complejo> findAll() {
        return (List<Complejo>) complejoRepository.findAll();
    }

    @Override
    public Optional<Complejo> finadById(Long id) {
        return complejoRepository.findById(id);
    }

    @Override
    public void save(Complejo complejo) {
       complejoRepository.save(complejo);
    }

    @Override
    public void deleteById(Long id) {
        complejoRepository.deleteById(id);
    }
}
