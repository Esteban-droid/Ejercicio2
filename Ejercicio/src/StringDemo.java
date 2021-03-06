public class StringDemo {

     public static void main(String[] args) {

        String ninja = "NTT Data es Incre?ble!";

        int length = ninja.length();

        System.out.println( "La longitud de la cadena es : " + length );
        
        //-----------------------------------------------------------------
        
        String cadena1 = "Mi nombre es ";

        String cadena2 = "Michael";

        String cadena3 = cadena1.concat(cadena2);

        System.out.println(cadena3);

        // Imprimir? mi nombre es Michael
        
        //-----------------------------------------------------------------
        
        System.out.println("Bienvenido," + " ninja" + "!");  // imprime "Bienvenido, ninja!"
        
        //-----------------------------------------------------------------
        
        String ninjaa = String.format("Hola %s, me debes $%.2f !", "Jack", 25.0);

        System.out.println(ninjaa);

        //Imprimir? Hola Jack, me debes $25.00 !

        //En el lugar de %s se espera una cadena.

        //En el lugar de %.2f se esper? un dato de tipo float. El n?mero 2 indica que se colocar?n dos n?meros a la derecha del punto decimal.
        
      //-----------------------------------------------------------------
        
        String ninjaaa = "Bienvenido a NTT Data!";

        int a = ninjaaa.indexOf("NTT"); // a es 13

        int b = ninjaaa.indexOf("do"); // b es 8

        int c = ninjaaa.indexOf("pizza"); // c es -1, "pizza" no ha sido encontrado.
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
      //-----------------------------------------------------------------

        String sentence = "   espacios en todos lados!   ";

        System.out.println(sentence.trim());
        
      //-----------------------------------------------------------------
        
        String aa = "HOLA";

        String bb = "mundo";

        System.out.println(aa.toLowerCase()); // hola

        System.out.println(bb.toUpperCase()); // MUNDO
        
       //------------------------------------------------------------------
        
        String aaa = new String("palabra");

        String bbb = new String("palabra");

        System.out.println(aaa == bbb); // Falso. No son el mismo objeto.

        System.out.println(aaa.equals(bbb)); // Verdadero. Tienen exactamente los mismos caracteres.
        
     }

}
