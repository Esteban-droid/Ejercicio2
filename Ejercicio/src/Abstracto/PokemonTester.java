package Abstracto;

public class PokemonTester {

	public static void main(String[] args) {
		
		Pokemon charizard = new Pokemon("Charizard", 100, "Fuego");
		Pokemon pikachu = new Pokemon("Pikachu", 100, "El�ctrico");
		
		//........................................
		
		charizard.attackPokemon(pikachu);
		
		//----------------------------------------
		
		Pokedex pokedex = new Pokedex();
		pokedex.listPokemon();
		

	}

}
