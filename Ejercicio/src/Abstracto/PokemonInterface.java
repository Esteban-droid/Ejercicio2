package Abstracto;

public interface PokemonInterface {
	
	default Pokemon createPokemon(String name, int health, String type) {
		return createPokemon(name, health, type);
	}
	
	default String pokemonInfo(Pokemon pokemon) {
		return pokemonInfo(pokemon);
	}
	
	default String listPokemon(Pokemon pokemon) {
		return listPokemon(pokemon);
	}
}
