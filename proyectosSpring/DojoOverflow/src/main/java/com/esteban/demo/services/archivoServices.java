package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Answer;
import com.esteban.demo.models.Question;
import com.esteban.demo.models.Tag;
import com.esteban.demo.repositories.AnswerRepository;
import com.esteban.demo.repositories.QuestionRepository;
import com.esteban.demo.repositories.TagRepository;

@Service
public class archivoServices {

	private final QuestionRepository questionRepository;
	private final AnswerRepository answerRepository;
	private final TagRepository tagRepository;
	
	public archivoServices(QuestionRepository questionRepository, AnswerRepository answerRepository, TagRepository tagRepository) {
		
		this.questionRepository = questionRepository;
		this.answerRepository = answerRepository;
		this.tagRepository = tagRepository;
	}
	
	//Creando question
	public void createQuestion(Question question) {
		questionRepository.save(question);
	}
	
	//Creando answer
	public void createAnswer(Answer answer) {
		answerRepository.save(answer);
	}
	
	//Creando tag
	public void createTag(Tag tag) {
		tagRepository.save(tag);
	}

	//Devolviendo todas las questions
	public List<Question> getAllQ(){
		return questionRepository.findAll();
	}
	
	//Devolviendo todas las answer
	public List<Answer> getAllA(){
		return answerRepository.findAll();
	}
	
	//Devolviendo todas las tag
	public List<Tag> fgetAllT() {
		return tagRepository.findAll();
	}
	
	//Obteniendo la información de un question
	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = questionRepository.findById(id);
		if(optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		}else {
			return null;
		}
	}
	
	//Obteniendo la información de un answer
	public Answer findAnswer(Long id) {
		Optional<Answer> optionalAnswer = answerRepository.findById(id);
		if(optionalAnswer.isPresent()) {
			return optionalAnswer.get();
		}else {
			return null;
		}
	}
	
	//Obteniendo la información de un tag
	public Tag findTag(Long id) {
		Optional<Tag> optionalTag = tagRepository.findById(id);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		}else {
			return null;
		}
	}
}
