public class Greeter {

    public String greet(String nombre){

        return "Hola " + nombre;

    }

    public String greet(){

        return "Hola Mundo";

    }
    
    //------------------------------------------------------------------
    
    private String createGreeting(String toBeGreeted){

        return "Hola " + toBeGreeted;

    }
    
    public String greet2(){

        return createGreeting("Mundo");

    }
    
    public String greet(String firstName, String lastName){

        return createGreeting(firstName + " " + lastName);

    }
    
    private String createGreeting2(String toBeGreeted){

        return "Greetings " + toBeGreeted;

    }

}
