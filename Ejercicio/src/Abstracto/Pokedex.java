package Abstracto;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	public int myPokemons = 0;

	public void listPokemon() {
		
		ArrayList<String> lista;
		lista = new ArrayList<String>();
		
		lista.add("Kakuna");
		lista.add("Pidgey");
		for(int i = 0; i<lista.size(); i++) {
			myPokemons++;
		}
		System.out.println("Hay " + myPokemons + " capturados");
	}

}
