package Zoologico1;

public class GorillaTest {

	public static void main(String[] args) {

		Gorila gorila = new Gorila();
		gorila.setEnergyLevel(100);
		gorila.throwSomething();
		gorila.desiplayEnergy();
		gorila.throwSomething();
		gorila.desiplayEnergy();
		gorila.throwSomething();
		gorila.desiplayEnergy();
		
		gorila.eatBananas();
		gorila.desiplayEnergy();
		gorila.eatBananas();
		gorila.desiplayEnergy();
		
		gorila.climb();
		gorila.desiplayEnergy();

	}

}
