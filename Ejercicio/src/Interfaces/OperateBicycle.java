package Interfaces;

public interface OperateBicycle {

    //void speedUp(int increment);

    //void applyBrakes(int decrement);
	
//--------------------------------------------------------------------------
    
    //Hay tres tipos de m�todos de Interfaz: default, static y abstract.
    
 // Una constante que es public, static y final

    double myConstant = 3.0;

    

    //El metodo predeterminado no necesita implementaci�n.

    default void sayHello() {

        System.out.println("Hola a todos.");

    }

    

    //El m�todo static que no necesita implementaci�n.

    static void staticMethod() {

        System.out.println("Hola desde el metodo static de la interfaz.");

    }

    void speedUp(int increment);

    void applyBrakes(int decrement);
    
    //--------------------------------------------------------------------------------------
    
    //Para implementar cualquier interfaz, debemos utilizar la palabra clave implements en la definici�n de nuestra clase. 

}