class Casting {

    public static void main(String[] args) {
    	
    	//Explicito

        double d = 35.25;

        double dd = 35.99;

        

        //Convirtiendo del valor de double d en un int

        int i = (int) d;

        

        //Convirtiendo del valor de double dd en un int

        int ii = (int) dd;

        System.out.println(i);

        System.out.println(ii);
        
        //Implicito
        
        int f = 35;

        float g = f;

        System.out.println("El numero es: " + g);

    }

}
