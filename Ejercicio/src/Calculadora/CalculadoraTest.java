package Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		
		Calculadora suma = operaciones.suma(10.5, 5.2);
		System.out.println(suma.getResult());
		
		System.out.println("----------------------------------------------");
		
		Calculadora operacion = operaciones.operacion_compleja(10.5, 5.2, 10);
		System.out.println(operacion.getResult());
		
		

	}

}
