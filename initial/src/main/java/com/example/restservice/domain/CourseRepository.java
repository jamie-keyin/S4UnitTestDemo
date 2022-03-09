package com.example.restservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByName(@Param("name")String name);
}
