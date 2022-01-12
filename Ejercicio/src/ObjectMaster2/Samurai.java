package ObjectMaster2;

import ObjectMaster1.Human;

public class Samurai extends Human{

	public int health = 200;
	static int contador = 0;
	
	public Samurai() {
		contador++;
	}
	
	
public void deathBlow(Human humano) {
	
		System.out.println("El samurai us� su definitiva!!!");
		humano.health = 0;
		System.out.println("La vida del humano esta en: " + humano.health);
		health = getHealth()/2;
		System.out.println("La vida del samurai se redujo a la mitad: " + health);
		System.out.println("------------------------------------------");
	}

public void meditate() {
	
		System.out.println("Samurai meditando...");
		health = getHealth()+(getHealth()/2);
		System.out.println("Vida recuperada: " + health);
		System.out.println("------------------------------------------");
	}

public void howMany() {
		
		System.out.println("Contando samurais...");
		System.out.println("Hay " + contador + " samurais actualmente");

	}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}




}
