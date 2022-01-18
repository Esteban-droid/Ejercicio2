package modelos;

public class cat extends animal implements pet{
	
	public cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	public String showAffection() {

		return "Ronroneando";
	}
}
