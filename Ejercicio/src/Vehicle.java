
public class Vehicle {

	    //private int numberOfWheels;

	    //private String color;

	    // getter

	    //public int getNumberOfWheels() {

	    //    return numberOfWheels;

	    //}

	    

	    // setter

	    //public void setNumberOfWheels(int numero) {

	    //    numberOfWheels = numero;

	    //}

	    // getter

	    //public String getColor() {

	    //    return color;

	    //}

	    // setter

	    //public void setColor(String color) {

	    //    this.color = color;        // 1

	    //}
	
	//--------------------------------Constructores y sobrecarga--------------------------------------------

	
	//private int numberOfWheels;

    //private String color;

    //public Vehicle(String color) {

        //Establecer el atributo color con el valor que tenga el parámetro color

    //    this.color = color;

    //}

    

    // ...

    // getters y setters removidos para resumir

    // ...
	
	//--------------------------------------------Ejemplo sobrecargando------------------------------------------------------------
	
	private int numberOfWheels;

    private String color;

    

    // ejemplo new Vehicle()

    public Vehicle() {

    }

    // ejemplo new Vehicle("algunColor")    

    public Vehicle(String color) {

        //Establecer el atributo color con el valor que tenga el parámetro color

        this.color = color;

    }

    

    // ejemplo new Vehicle("algunColor", 4)    

    public Vehicle(String color, int num) {

        this.color = color;

        this.numberOfWheels = num;

    }

        

    // ...

    // getters y setters removidos para resumir

    // ...
	
	
	
	}