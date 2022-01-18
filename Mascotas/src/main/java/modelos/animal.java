package modelos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class animal{

private String name;

private String breed;

private int weight;

public animal(String nombre, String raza, int peso) {
	name = nombre;
	breed = raza;
	weight = peso;
}

//getters y setters

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

}