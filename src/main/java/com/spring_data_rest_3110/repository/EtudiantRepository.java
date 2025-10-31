package com.spring_data_rest_3110.repository;

import com.spring_data_rest_3110.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="etudiants")
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
