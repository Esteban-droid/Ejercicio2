package Abstracto;

public class PhoneTester {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone("11.2.1",85,"Disponible","default");
		iphone.displayInfo();
		iphone.ring();
		iphone.unlock();
		
		System.out.println("--------------------------------------");

		Galaxy galaxy = new Galaxy("S21", 2, "Disponible", "default");
		galaxy.displayInfo();
		galaxy.ring();
		galaxy.unlock();

	}

}
