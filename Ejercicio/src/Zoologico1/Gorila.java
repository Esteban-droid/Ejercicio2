package Zoologico1;

public class Gorila extends Mammal{

	public void throwSomething() {
		
		System.out.println("El mono a tirado algo"); //-5 energia
		setEnergyLevel(getEnergyLevel()-5);
	
	}
	
	public void eatBananas() {
		
		System.out.println("El mono comi� una banana...�umi!"); //+10 energia
		setEnergyLevel(getEnergyLevel()+10);

	}
	
	public void climb() {
		
		System.out.println("El mono trep� a la cima del �rbol"); //-10 energia
		setEnergyLevel(getEnergyLevel()-10);
	}

}
