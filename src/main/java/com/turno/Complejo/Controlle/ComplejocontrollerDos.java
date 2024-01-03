package com.turno.Complejo.Controlle;

import com.turno.Complejo.ComplejoDTO.DTOComplejo;
import com.turno.Complejo.ComplejoDTO.DatosRespuestaComplejo;
import com.turno.Complejo.Entidad.Complejo;
import com.turno.Complejo.Repository.ComplejoRepository;
import com.turno.Complejo.Service.IComplejoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/complDos")
public class ComplejocontrollerDos {

    @Autowired
    ComplejoRepository complejoRepository;
    @Autowired
    IComplejoService iComplejoService;



    @GetMapping
    public ResponseEntity<?> listAll() {
        return ResponseEntity.ok(iComplejoService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> ListById(@PathVariable Long id){
        return ResponseEntity.ok(complejoRepository.findById(id));
    }

    @PostMapping
    public void registrarComplejo(@RequestBody DatosRespuestaComplejo datosRespuestaComplejo) {
        iComplejoService.save(new Complejo(datosRespuestaComplejo));

    }



}
