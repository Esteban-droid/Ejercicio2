
public class TestSum {

	public static void main(String[] args) {

		//Con variables objeto
		
	    //long start = System.currentTimeMillis();

	    //Integer sum = 0;

	    //for (int i = 0; i < Integer.MAX_VALUE; i++) {

	    //    sum += i;

	    //}

	    //System.out.println("Suma: " + sum);

	    //long end = System.currentTimeMillis();

	    //double total = (double) (end - start) / 1000;

	    //System.out.println("Tiempo de ejecucion: " + total + " segundos");
	    
	    //Con variables primitivos
		
		long start = System.currentTimeMillis();

	    int sum = 0;

	    for (int i = 0; i < Integer.MAX_VALUE; i++) {

	        sum += i;

	    }

	    System.out.println("Suma: " + sum);

	    long end = System.currentTimeMillis();

	    double total = (double) (end - start) / 1000;

	    System.out.println("Tiempo de ejecucion: " + total + " segundos");

	}

}
