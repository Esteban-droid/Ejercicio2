package modelos;

public class dog extends animal implements pet{
	
	private static final long serialVersionUID = 1L;
	
	public dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	public String showAffection() {

			return "Perro cansado";
	}
}
