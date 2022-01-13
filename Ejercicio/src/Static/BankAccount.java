package Static;

import java.util.Random;

public class BankAccount {

	private String nCuenta;
	private static double sCorriente=0;
	private static double sAhorro=0;
	
	private static int numberOfAccounts = 0;
	
	public BankAccount() { //Constructor

        nCuenta = randomNumber();
        sCorriente = 0;
        sAhorro=0;
        numberOfAccounts++;

    }
	
    private String randomNumber() {
    	Random dato = new Random();
    	//String number="";
    	//for(int i = 1; i<=10; i++) {
    	//	int numero = dato.nextInt(10);
    	//	number=number+numero;
    	//}
    	//return number;
    	
    	Integer number = dato.nextInt(1000000000)+1000000000;
    	return number.toString();
    	
    }
    
    public static void depositar(char tipoCta, double valor) {
    	if (tipoCta == 'C' || tipoCta =='c') {
    		sCorriente = sCorriente + valor;
    	} else if(tipoCta == 'A' || tipoCta =='a') {
    		sAhorro = sAhorro + valor;
    	}else {
    		System.out.println("Error al ingresar tipo de cuenta");
    	}
    }
    
    public static void retirar(char tipoCta, double valor) {
    	if (tipoCta == 'C' || tipoCta =='c') {
    		sCorriente = sCorriente - valor;
    	}else if(tipoCta == 'A' || tipoCta =='a') {
    		sAhorro = sAhorro - valor;
    	}
    }
    
    public static String verTotal() {
    	double corriente = getsCorriente();
    	double ahorro = getsAhorro();
    	numberOfAccounts++;
        return "Total en corriente: " + corriente + "." + " Total en ahorro: " + ahorro + "." + "\nHay: " + numberOfAccounts + " cuentas creadas.";
        

     }

    
    //getters y setters

		public String getnCuenta() {
			return nCuenta;
		}

		public void setnCuenta(String nCuenta) {
			this.nCuenta = nCuenta;
		}

		public static double getsCorriente() { //getter saldo cuenta corriente
			return sCorriente;
		}

		public void setsCorriente(double sCorriente) {
			this.sCorriente = sCorriente;
		}

		public static double getsAhorro() { //getter saldo cuenta ahorro
			return sAhorro;
		}

		public void setsAhorro(double sAhorro) {
			this.sAhorro = sAhorro;
		}

		public int getNumberOfAccounts() {
			return numberOfAccounts;
		}

		public void setNumberOfAccounts(int numberOfAccounts) {
			BankAccount.numberOfAccounts = numberOfAccounts;
		}

}
    
