package Static;

public class PersonTest {

    public static void main(String[] args) {

    	//Con variable estatica
    	
        //Person person1 = new Person(10, "Persona1");

        //Person person2 = new Person(5, "Persona2");

        //System.out.println(Person.numberOfPeople);
    	
    	//------------------------------------------------------
    	
    	//Con metodo estatico

            Person person1 = new Person(10, "Persona1");

            Person person2 = new Person(5, "Persona2");

            System.out.println(Person.peopleCount());

    }

}