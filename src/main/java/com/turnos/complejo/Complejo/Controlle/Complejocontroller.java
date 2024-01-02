package com.turnos.complejo.Complejo.Controlle;

import com.turnos.complejo.Complejo.Repository.ComplejoRepository;
import com.turnos.complejo.Complejo.ComplejoDTO.DatosRespuestaComplejo;
import com.turnos.complejo.Complejo.Entidad.Complejo;
import com.turnos.complejo.Complejo.Service.IComplejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/compl")
public class Complejocontroller {

    //creando el servicio


        @Autowired
         IComplejoService iComplejoService;
//ServisioCompl servisioCompl;
        @GetMapping
        public ResponseEntity<?> listAll() {
        return ResponseEntity.ok(iComplejoService.findAll());}
/*
    @GetMapping("/find/{/id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Complejo> complejoOptional = iComplejoService.findById(id);
        if(complejoOptional.isPresent()){

            Complejo complejo = complejoOptional.get();

            DatosRespuestaComplejo complejoDTO = DatosRespuestaComplejo.builder()

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
        return ResponseEntity.notFound().build(); // min 50 no anda mirando
    }*/
    @PostMapping
    public void registrarComplejo(@RequestBody DatosRespuestaComplejo datosRespuestaComplejo) {
    iComplejoService.save(new Complejo(datosRespuestaComplejo));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        iComplejoService.deleteById(id);
        return ResponseEntity.ok(null);
    }

    /*@PutMapping
    @Transactional
    public ResponseEntity actualiz(@RequestBody DTOActualizarComplejo dtoActualizarComplejo){
            Complejo complejo = iComplejoService.getReferenceById(dtoActualizarComplejo.idComplejo());
            complejo.actualizarDatos(dtoActualizarComplejo);

            return ResponseEntity.ok(new DatosRespuestaComplejo(complejo.getIdComplejo(), complejo.getNombre(),
                    complejo.getApellido(), complejo.getEmail(), complejo.getTel(), complejo.getCantCanchas(),
                    complejo.getEspecialidad()));
    }*/


}



