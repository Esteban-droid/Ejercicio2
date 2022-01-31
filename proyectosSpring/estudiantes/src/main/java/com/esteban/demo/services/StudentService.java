package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Contact;
import com.esteban.demo.models.Student;
import com.esteban.demo.repositories.ContactRepository;
import com.esteban.demo.repositories.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepo;
	private ContactRepository contactRepo;
	
	public StudentService(StudentRepository studentRepo, ContactRepository contactRepo) {
		this.studentRepo = studentRepo;
		this.contactRepo = contactRepo;
	}
	
	//Devolviendo todos los estudiantes.
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	//Obteniendo la información de un estudiante.
	public Student findStudent(Long id) {
		Optional<Student> optionalStudent = studentRepo.findById(id);
		if(optionalStudent.isPresent()) {
			return optionalStudent.get();
		}else{
			return null;
		}
	}
	
	//Creando contacto
	public Contact createContact(Contact contact) {
		return contactRepo.save(contact);
		
			
	}
	
	//Creando estudiante
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
}