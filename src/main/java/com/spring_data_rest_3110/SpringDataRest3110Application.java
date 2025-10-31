package com.spring_data_rest_3110;

import com.spring_data_rest_3110.enums.Genre;
import com.spring_data_rest_3110.model.Etudiant;
import com.spring_data_rest_3110.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringDataRest3110Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataRest3110Application.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);

    }
}