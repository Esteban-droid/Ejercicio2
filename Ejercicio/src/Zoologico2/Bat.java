package Zoologico2;

import Zoologico1.Mammal;

public class Bat extends Mammal{

	public void fly() {
		
		System.out.println("Buff!! El murci?lago a volado!!"); //-50 energia
		setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		
		System.out.println("Bueno, no importa"); //+25 energia
		setEnergyLevel(getEnergyLevel() + 25);

	}

	public void attackTown() {
		
		System.out.println("La ciudad est? en llamas!!"); //-100 energia
		setEnergyLevel(getEnergyLevel() - 100);
		
	}


}
