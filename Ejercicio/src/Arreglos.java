import java.util.ArrayList;

public class Arreglos {

	public static void main(String[] args) {

		int[] myArray; //Declaración

		myArray = new int[5]; // Inicialización

		myArray[0] = 4; // agregar valor

		myArray[1] = 8; // agregar valor

		myArray[2] = 8; // agregar valor

		myArray[3] = 5; // agregar valor

		myArray[4] = 9; // agregar valor
		
		//---------------------------------------------------
		
		//Todo de una vez:

		int[] myArray2 = {4, 8, 8, 5, 9};
		
		//---------------------------------------------------
		
		//import java.util.ArrayList;

		//ArrayList<Integer> myArray = new ArrayList<Integer>();
		
		//---------------------------------------------------
		
		//Bucle while
		
		int i = 0;

		while(i < 7)

		{

		    System.out.println("foo");

		    i++;

		}
		
		//---------------------------------------------------
		
		//Bucle for
		
		//for (initialization; termination; increment){

		//    body statements

		//}
		
		for (int ii = 0; ii < 7; ii++){

		    System.out.println("bar");

		}
		
		//---------------------------------------------------
		
		//Array con for
		
		ArrayList<String> dynamicArray = new ArrayList<String>();

		dynamicArray.add("hello");

		dynamicArray.add("world");

		dynamicArray.add("etc");

		for (int iii = 0; iii < dynamicArray.size(); iii++){

		    System.out.println(dynamicArray.get(iii));

		}
		
	}

}
