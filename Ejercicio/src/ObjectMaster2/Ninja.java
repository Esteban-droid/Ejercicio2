package ObjectMaster2;

import ObjectMaster1.Human;

public class Ninja extends Human{
	
	public int stealth  = 10;
	
public void steal(Human humano) {
		
		System.out.println("El ninja rob? puntos del humano!");
		humano.health = humano.health-stealth;
		health = getHealth() + stealth;
		System.out.println("Vida del humano afectado por sigilo: " + humano.health);
		System.out.println("Vida del ninja que rob?: " + health);
		System.out.println("------------------------------------------");
	
	}

public void runAway() {
	
	System.out.println("El ninja se escap?!");
	health = getHealth() - 10;
	System.out.println("Vida del ninja al escapar: " + health);
	System.out.println("------------------------------------------");

}

public int getStealth() {
	return stealth;
}

public void setStealth(int stealth) {
	this.stealth = stealth;
}

}
