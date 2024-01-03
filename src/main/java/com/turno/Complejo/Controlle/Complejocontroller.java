package com.turno.Complejo.Controlle;

import com.turno.Complejo.ComplejoDTO.DTOComplejo;
import com.turno.Complejo.ComplejoDTO.DTOComplejoUno;
import com.turno.Complejo.Entidad.Complejo;
import com.turno.Complejo.Service.IComplejoService;
import com.turno.Complejo.ComplejoDTO.DatosRespuestaComplejo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping("/compl")
public class Complejocontroller {


        @Autowired
        IComplejoService iComplejoService;

    @GetMapping
    public ResponseEntity<?> listAll() {

        List<DTOComplejoUno> complejoList = iComplejoService.findAll()
                .stream()
                .map(complejo ->  DTOComplejoUno.builder()
                        .idComplejo(complejo.getIdComplejo())
                        .nombre(complejo.getNombre())
                        .apellido(complejo.getApellido())
                        .email(complejo.getEmail())
                        .tel(complejo.getTel())
                        .cantCanchas(complejo.getCantCanchas())
                        .especialidad(complejo.getEspecialidad())
                        .build())
                .toList();


    return ResponseEntity.ok(complejoList);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Complejo> complejoOptional = iComplejoService.finadById(id);
        if(complejoOptional.isPresent()){

            Complejo complejo = complejoOptional.get();

           DTOComplejoUno complejoDTO = DTOComplejoUno.builder()

                    .idComplejo(complejo.getIdComplejo())
                    .nombre(complejo.getNombre())
                    .apellido(complejo.getApellido())
                    .email(complejo.getEmail())
                    .tel(complejo.getTel())
                    .cantCanchas(complejo.getCantCanchas())
                    .especialidad(complejo.getEspecialidad())
                    .build();
            return  ResponseEntity.ok(complejoDTO);

        }
        return ResponseEntity.notFound().build();
    }




    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody DTOComplejoUno dtoComplejo) throws URISyntaxException {
        iComplejoService.save(Complejo.builder()

                .idComplejo(dtoComplejo.getIdComplejo())
                .nombre(dtoComplejo.getNombre())
                .apellido(dtoComplejo.getApellido())
                .email(dtoComplejo.getEmail())
                .tel(dtoComplejo.getTel())
                .cantCanchas(dtoComplejo.getCantCanchas())
                .especialidad(dtoComplejo.getEspecialidad())
                .build());


    return ResponseEntity.created(new URI("/compl/save")).build();

    }

    @PutMapping("/update/{id}")
    @Transactional
    public ResponseEntity<?> UpdateComplejo(@PathVariable Long id, @RequestBody DTOComplejoUno dtoComplejoUno){
       Optional<Complejo> complejoOptional = iComplejoService.finadById(id);
       if(complejoOptional.isPresent()){
           Complejo complejo = complejoOptional.get();
           complejo.setApellido(dtoComplejoUno.getApellido());
           complejo.setNombre(dtoComplejoUno.getNombre());
           complejo.setEmail(dtoComplejoUno.getEmail());
           complejo.setTel(dtoComplejoUno.getTel());
           complejo.setCantCanchas(dtoComplejoUno.getCantCanchas());
           complejo.setEspecialidad(dtoComplejoUno.getEspecialidad());
           iComplejoService.save(complejo);
           return ResponseEntity.ok("Registro Actualizad...");

       }
       return ResponseEntity.notFound().build();

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        iComplejoService.deleteById(id);
        return ResponseEntity.ok(null);
    }




}



