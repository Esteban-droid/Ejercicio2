
public class Condicionales {

	public static void main(String[] args) {
		
		//if(hay una construcci�n adelante) { 

		//    utilizar un desv�o

		//} else {

		//    seguir la ruta normal

		//}
		
		//------------------------------------------------------
		
		boolean defensor = true;

		if(defensor == true) {

		    System.out.println("Pasar el balon");

		}
		
		//------------------------------------------------------
		
		if(defensor == true) {

		    System.out.println("Pasar el balon");

		} else {

		    System.out.println("Lanzar el balon");

		}
		
		//------------------------------------------------------
		
		boolean defensorr = true;

		boolean cestaEstaCerca = true;

		if(defensorr == true) {

		    System.out.println("Pasar el balon");

		} else if(cestaEstaCerca == true) {

		    System.out.println("Lanzar el balon");

		} else {

		    System.out.println("Avanzar con el balon");

		}

	}

}
