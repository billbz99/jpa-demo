package io.jpabuddy.spring.demo.jpademo.repositories;

import io.jpabuddy.spring.demo.jpademo.entities.VwCustomerProfileLookup;
import io.jpabuddy.spring.demo.jpademo.entities.VwCustomerProfileLookupId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VwCustomerProfileLookupRepository
        extends JpaRepository<VwCustomerProfileLookup, VwCustomerProfileLookupId> {

    List<VwCustomerProfileLookup> findById_PersonFirstNameAndId_PersonLastNameAndId_Ssn(String personFirstName, String personLastName, String ssn);

    @Query("select v from VwCustomerProfileLookup v " +
            "where v.id.personFirstName = ?1 and v.id.personLastName = ?2 and v.id.ssn = ?3")
    List<VwCustomerProfileLookup> findPersonAttributes(String personFirstName, String personLastName, String ssn);

    



}