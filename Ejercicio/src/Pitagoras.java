public class Pitagoras {

    public double calcularHipotenusa(int catetoA, int catetoB) {

        //La hipotenusa es el lado opuesto del ángulo recto.

        //Calcular el valor de c dados los valores catetoA y catetoB
    	
    	double hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
		return hipotenusa;

    }

}