package com.example.demo.repositories;

import com.example.demo.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University,Long> {

    List<University> findAllByNameAndAddress(String name, String address);
    List<University> findAllByName(String name);
    List<University> findAllByNameAndCreateDate(String name, Date createDate);
    Optional<University> findById(Long id);

}
