package ObjectMaster1;

import ObjectMaster2.Wizard;
import ObjectMaster2.Ninja;
import ObjectMaster2.Samurai;

public class HumanTest {

	public static void main(String[] args) {
		Human humano = new Human();
		
		Human victima = new Human();
		
		//Humano atacando a victima
		humano.attack(victima);
		humano.attack(victima);
		humano.attack(victima);
		
		//Victima atacando a humano
		//victima.attack(humano);
		//System.out.println("La victima ha atacado");
		//System.out.println("Vida del humano: " + humano.getHealth());
		
		//--------------------------------------------------------------------
		
		Wizard mago = new Wizard();
		mago.heal(humano);
		mago.fireBall(humano);
		
		//--------------------------------------------------------------------

		Ninja ninja = new Ninja();
		ninja.steal(humano);
		ninja.steal(humano);
		ninja.runAway();
		
		//--------------------------------------------------------------------
		
		Samurai samurai = new Samurai();
		samurai.deathBlow(humano);
		samurai.deathBlow(humano);
		samurai.meditate();
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		Samurai samurai4 = new Samurai();
		samurai.howMany();
		
		
	}

}
