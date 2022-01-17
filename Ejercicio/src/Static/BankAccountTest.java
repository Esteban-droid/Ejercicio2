package Static;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount cuenta = new BankAccount();
		
		cuenta.depositar('C',1500);
		System.out.println("Saldo de cuenta corriente:" + cuenta.getsCorriente());
		
		cuenta.depositar('A',8543);
		System.out.println("Saldo cuenta de ahorro:" +cuenta.getsAhorro());
		
		cuenta.depositar('A',1000);
		System.out.println("Saldo cuenta de ahorro:" +cuenta.getsAhorro());
		
		cuenta.retirar('C', 1600);
		System.out.println("Saldo de cuenta corriente:" + cuenta.getsCorriente());
		
		BankAccount cuenta2 = new BankAccount();
		
		System.out.println("----------------------------------------------------");
		System.out.println(cuenta.verTotal());
		System.out.println("----------------------------------------------------");
		
	}

}
