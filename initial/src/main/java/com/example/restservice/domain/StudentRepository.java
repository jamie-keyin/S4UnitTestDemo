package com.example.restservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByLastName(@Param("last_name")String lastName);
    List<Student> findByCourses_Name(@Param("course_name")String courseName);
    List<Student> findByPrimaryAddress_CityAndPrimaryAddress_PostalCode(@Param("city")String city, @Param("postal_code")String postalCode);
}
