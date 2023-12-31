package com.turnos.Hello.Complejo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/compl")
public class Complejocontroller {

    //creando el servicio
        @Autowired
        ComplejoRepository complejoRepository;
//ServisioCompl servisioCompl;
        @GetMapping
        public ResponseEntity<?> listAll() {
        return ResponseEntity.ok(complejoRepository.findAll());}

/*
    @Autowired
    ComplejoRepository complejoRepository;


    @GetMapping
    public List<DatosRespuestaComplejo> datosRespuestaComplejo() {

        return complejoRepository.findAll().stream().map(DatosRespuestaComplejo::new).toList();

    }*/

    @PostMapping
    public void registrarComplejo(@RequestBody DatosRespuestaComplejo datosRespuestaComplejo) {
 complejoRepository.save(new Complejo(datosRespuestaComplejo));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        complejoRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }
}



