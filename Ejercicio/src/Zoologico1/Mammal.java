package Zoologico1;

public class Mammal {

	private int energyLevel;
	
	public void desiplayEnergy() {
		
		System.out.println("Nivel de energ�a: " + energyLevel);
		System.out.println("------------------------------------------");
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}