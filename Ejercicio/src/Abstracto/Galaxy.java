package Abstracto;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    public void ring() {
    	System.out.println("anillo");
    }

    public void unlock() {
    	System.out.println("bloqueado");
    }

    public void displayInfo() {

		System.out.println("Versión de GALAXY: " + getVersionNumber());
		System.out.println("La batería tiene: " + getBatteryPercentage() + "% de energía");
		System.out.println("Cargador: " + getCarrier());
		System.out.println("Tono: " + getRingTone());
    }

}