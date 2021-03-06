package Abstracto;

public class Pokemon {
	
	String name;
	int health;
	String type;
	
	public static int count;
	
	public Pokemon(String nombre, int vida, String tipo) { //constructor
		name = nombre;
		health = vida;
		type = tipo;
	}

	public void attackPokemon(Pokemon pokemon) {
		int ataque = 10;
		System.out.println("El pokemon a atacado!");
		pokemon.health = pokemon.health-ataque;
		System.out.println("La vida del pokemon atacado se reduce en " + ataque + ". " + "Vida actual del pokemon: " + pokemon.health);
	}
	
	//getters y setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
