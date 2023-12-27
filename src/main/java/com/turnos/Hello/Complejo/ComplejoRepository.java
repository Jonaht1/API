package com.turnos.Hello.Complejo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplejoRepository extends JpaRepository<Complejo,Long> {



}
