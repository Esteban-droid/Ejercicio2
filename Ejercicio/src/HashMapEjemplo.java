import java.util.HashMap; //Primero se importa

public class HashMapEjemplo {

	public static void main(String[] args) {
		
		HashMap<String, String> userMap = new HashMap<String, String>(); //Luego se crea

		userMap.put("nninja@codingdojo.com", "Nancy Ninja"); //Almacenando datos

		userMap.put("ssamurai@codingdojo.com", "Sam Samurai"); //Almacenando datos
		
		String name = userMap.get("nninja@codingdojo.com"); //Obtener dato
		
		System.out.println(name); //Obtenemos su valor...Nancy Ninja
	}

}
