import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {
		
		HashMap<String, String> trackList = new HashMap<String, String>();
		
		trackList.put("Love me do", "'Cause I'm a legend");
		trackList.put("The system of life", "In this world we live");
		trackList.put("I�m a programmer", "Mi life is a boolean");
		trackList.put("The cycle of sleep", "We all dream about a place");
		
		String track = trackList.get("I�m a programmer");
		System.out.println(track); //Extrae canci�n por t�tulo
		System.out.println("------------------------------------------------");
		
		//--------------------------------------------------------------------
		
        Set<String> keys = trackList.keySet();

        for(String key : keys) {

            System.out.println("Track: " + key);
            System.out.println("Lyrics: " + trackList.get(key));   
            System.out.println("------------------------------------------------");

        }
	}

}
