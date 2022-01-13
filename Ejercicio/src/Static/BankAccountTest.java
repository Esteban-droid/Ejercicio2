package Static;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount cuenta = new BankAccount();
		
		BankAccount.depositar('C',1500);
		System.out.println("Saldo de cuenta corriente:" + cuenta.getsCorriente());
		
		BankAccount.depositar('A',8543);
		System.out.println("Saldo cuenta de ahorro:" +cuenta.getsAhorro());
		
		BankAccount.depositar('A',1000);
		System.out.println("Saldo cuenta de ahorro:" +cuenta.getsAhorro());
		
		BankAccount.retirar('C', 100);
		System.out.println("Saldo de cuenta corriente:" + cuenta.getsCorriente());
		
		System.out.println("----------------------------------------------------");
		System.out.println(BankAccount.verTotal());
		System.out.println("----------------------------------------------------");
		
	}

}
