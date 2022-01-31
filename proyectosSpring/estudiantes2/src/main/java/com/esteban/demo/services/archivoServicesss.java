package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Dorm;
import com.esteban.demo.models.Student;
import com.esteban.demo.repositories.DormRepository;
import com.esteban.demo.repositories.StudentRepository;

@Service
public class archivoServicesss {
	
	private StudentRepository studentRepo;
	private DormRepository dormRepo;
	
	public archivoServicesss(StudentRepository studentRepo, DormRepository dormRepo) {
		this.studentRepo = studentRepo;
		this.dormRepo = dormRepo;
	}
	
	//Devolviendo todos los estudiantes.
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	//Devolviendo todos los dormitorios
	public List<Dorm> getDorms(){
		return dormRepo.findAll();
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
	
	//Obteniendo la información de un dormitorio
	public Dorm findDorm(Long id) {
		Optional<Dorm> optionalDorm = dormRepo.findById(id);
		if(optionalDorm.isPresent()) {
			return optionalDorm.get();
		}else {
			return null;
		}
	}
	
	//Creando estudiante
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	//Creando dormitorio
	public Dorm createDorm(Dorm dorm) {
		return dormRepo.save(dorm);
	}
	
	
	//Borrar estudiante
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}	
	
	//Borrar2
	public Dorm removeStudentDorm(Long dormID, Long studentID) {
		Optional<Student> checkstudent = studentRepo.findById(studentID);
		Optional<Dorm> checkdorm = dormRepo.findById(dormID);
		if (checkstudent.isPresent() && checkdorm.isPresent()) {
			Student student = checkstudent.get();
			Dorm dorm = checkdorm.get();
			student.setDorm(null);
			studentRepo.save(student);
			return dorm;
		}
		return null;		
	}
}


