package com.nicolasp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nicolasp.model.Persona;
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
