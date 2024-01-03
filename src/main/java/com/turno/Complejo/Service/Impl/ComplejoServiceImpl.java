package com.turno.Complejo.Service.Impl;

import com.turno.Complejo.Entidad.Complejo;
import com.turno.Complejo.Persistencia.IComplejoDAO;
import com.turno.Complejo.Service.IComplejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplejoServiceImpl implements IComplejoService {

@Autowired
private IComplejoDAO complejoDAO;
    @Override
    public List<Complejo> findAll() {
        return complejoDAO.findAll();
    }

    @Override
    public Optional<Complejo> finadById(Long id) {
        return complejoDAO.finadById(id);
    }


    @Override
    public void save(Complejo complejo) {
    complejoDAO.save(complejo);
    }

    @Override
    public void deleteById(Long id) {
    complejoDAO.deleteById(id);
    }
}
