package com.turno.Complejo.Controlle;

import com.turno.Complejo.ComplejoDTO.DTOComplejo;
import com.turno.Complejo.ComplejoDTO.DatosRespuestaComplejo;
import com.turno.Complejo.Entidad.Complejo;
import com.turno.Complejo.Repository.ComplejoRepository;
import com.turno.Complejo.Service.IComplejoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
@RestController
@RequestMapping("/complTres")
public class ComplejocontrollerTres {

    @Autowired
    ComplejoRepository complejoRepository;
    @Autowired
    IComplejoService iComplejoService;
    @PostMapping("/save")
    public ResponseEntity<DatosRespuestaComplejo> save(@RequestBody @Valid DatosRespuestaComplejo datosRespuestaComplejo,
                                                       UriComponentsBuilder uri){
        Complejo complejo = complejoRepository.save(new Complejo(datosRespuestaComplejo));
        DatosRespuestaComplejo datosRespuestaComplejo1 = new DatosRespuestaComplejo(complejo.getIdComplejo(),
                complejo.getNombre(), complejo.getApellido(), complejo.getEmail(), complejo.getTel(),
                complejo.getCantCanchas(), complejo.getEspecialidad());

        URI url = uri.path("/complejo/{id}").buildAndExpand(complejo.getIdComplejo()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaComplejo1);


    }



    @PutMapping
    @Transactional
     public ResponseEntity actualiz(@RequestBody DTOComplejo dtoComplejo){
        Complejo complejo = complejoRepository.getReferenceById(dtoComplejo.idComplejo());
        complejo.actualizarDatos(dtoComplejo);

        return ResponseEntity.ok(new DatosRespuestaComplejo(complejo.getIdComplejo(), complejo.getNombre(),
                complejo.getApellido(), complejo.getEmail(), complejo.getTel(), complejo.getCantCanchas(),
                complejo.getEspecialidad()));
    }

}
