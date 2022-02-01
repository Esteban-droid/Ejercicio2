package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    public List<Answer> findAll();
}