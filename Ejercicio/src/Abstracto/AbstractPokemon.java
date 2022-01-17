package Abstracto;

public abstract class AbstractPokemon implements PokemonInterface{
	
	public Pokemon createPokemon() {
		return createPokemon("pokemon",100,"agua");
	}

	public String pokemonInfo(Pokemon pokemon) {
		String nombre = pokemon.getName();
		int vida = pokemon.getHealth();
		String tipo = pokemon.getType();
		return "Pokemon: " + nombre + "Vida: " + vida + "De tipo: " + tipo;
	}

}
