package com.turnos.complejo.Complejo.Repository;

import com.turnos.complejo.Complejo.Entidad.Complejo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplejoRepository extends JpaRepository<Complejo,Long> {



}
