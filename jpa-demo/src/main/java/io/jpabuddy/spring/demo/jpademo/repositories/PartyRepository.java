package io.jpabuddy.spring.demo.jpademo.repositories;

import io.jpabuddy.spring.demo.jpademo.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyRepository extends JpaRepository<Party, Integer> {
    List<Party> findByPartyName(String partyName);

}