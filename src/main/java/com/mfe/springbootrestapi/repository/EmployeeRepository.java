package com.mfe.springbootrestapi.repositiry;

import com.mfe.springbootrestapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
    // JpaRepository provides a lot of data query methods


}
