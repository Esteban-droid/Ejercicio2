package Abstracto;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    public String ring() {
		return "Rington";
    }

    public String unlock() {
    	return "Desbloqueado";
    }

    public void displayInfo() {

		System.out.println("Versi?n de IPHONE: " + getVersionNumber());
		System.out.println("La bater?a tiene: " + getBatteryPercentage() + "% de energ?a");
		System.out.println("Cargador: " + getCarrier());
		System.out.println("Tono: " + getRingTone());

    }

}