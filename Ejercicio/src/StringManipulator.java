
public class StringManipulator {

	public static void main(String[] args) {
		

	}

	public String trimAndConcat(String string, String string2) {
		return string.trim()+string2.trim();
	}

	public int getIndexOrNull(String string, char letter) {
		return string.indexOf(letter);
	}
	
	public int getIndexOrNull(String string, String string2) {
		return string.indexOf(string2);
	}

	public String concatSubstring(String string, int numero1, int numero2, String string2) {
		return string.substring(numero1, numero2) + string2;
	}
}
