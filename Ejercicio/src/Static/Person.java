package Static;

public class Person {

	//Con variable estatica
	
    //private int age;

    //private String name;

    //public static int numberOfPeople = 0;

    //public Person(int ageParam, String nameParam) { //Constructor

    //    age = ageParam;

    //    name = nameParam;

    //    numberOfPeople++;

    //}
	
	//-----------------------------------------------------
	
	//Con metodo estatico
	
	    private int age;

	    private String name;

	    // the variable is now private

	    private static int numberOfPeople = 0;

	    public Person(int ageParam, String nameParam) { //Constructor

	        age = ageParam;

	        name = nameParam;

	        numberOfPeople++;

	    }

	    public static int peopleCount() {

	        return numberOfPeople;

	    }


}
