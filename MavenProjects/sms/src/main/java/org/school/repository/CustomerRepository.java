package org.school.repository;

import java.util.List;


import org.school.model.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Repository;

import javax.annotation.ManagedBean;
@Profile("mysql")
@ComponentScan
@Repository
public interface CustomerRepository extends CrudRepository<Student, Long> {

   // List<Student> findByName(String name);

    List<Student> findByAddress(String address);

    Student findById(long id);

    long count();

    @Override
    void deleteAll();
}
