public class GreeterTest {

    public static void main(String[] args){

        Greeter hW = new Greeter();

        String greeting = hW.greet();

        String greetingWithName = hW.greet("Eduardo");

        if (greeting.equals("Hola Mundo") || greetingWithName.equals("Hola Eduardo")){

            System.out.println("Prueba exitosa.");

        } else{

            System.out.println("La prueba fallo");

        }

    }

}