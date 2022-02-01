package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
    public List<Question> findAll();
}