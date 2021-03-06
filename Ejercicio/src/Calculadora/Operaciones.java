package Calculadora;

public class Operaciones {
	
	public Calculadora suma(double num1, double num2) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperandOne(num1);
		calculadora.setOperandTwo(num2);
		calculadora.setResult(num1+num2);
		return calculadora;
	}
	
	public Calculadora resta(double num1, double num2) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperandOne(num1);
		calculadora.setOperandTwo(num2);
		calculadora.setResult(num1-num2);
		return calculadora;
	}
	
	public Calculadora multiplicacion(double num1, double num2) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperandOne(num1);
		calculadora.setOperandTwo(num2);
		calculadora.setResult(num1*num2);
		return calculadora;
	}
	
	public Calculadora division(double num1, double num2) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperandOne(num1);
		calculadora.setOperandTwo(num2);
		calculadora.setResult(num1/num2);
		return calculadora;
	}
	
	public Calculadora operacion_compleja(double num1, double num2, double num3) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperandOne(num1);
		calculadora.setOperandTwo(num2);
		calculadora.setResult(num1+num2*num3);
		return calculadora;
		}
	
}
