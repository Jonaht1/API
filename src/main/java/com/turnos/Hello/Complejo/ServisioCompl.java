package com.turnos.Hello.Complejo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServisioCompl{


        @Autowired
        ComplejoRepository complejoRepository;

        public List<Complejo> findAll() {
            return complejoRepository.findAll();
        }


    }