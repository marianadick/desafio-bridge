package com.example.number_challenge.repository;

import com.example.number_challenge.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
@Transactional
public interface NumberRepository extends JpaRepository<Number, Integer> {
}
