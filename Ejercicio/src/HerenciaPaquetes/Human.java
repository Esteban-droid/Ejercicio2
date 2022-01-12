package HerenciaPaquetes;

public class Human extends Mammal{ //Ahora lo que tiene Mammal lo tiene Human, excepto los atributos si es que estan con getters y setters

    public void goToWork(){

        System.out.println("Voy a trabajar, algo que solo los humanos hacen.");

    }
    
    public void startSleeping() { //Aqui se sobreescribe el metodo de startSleeping del Mammal

        System.out.println("Toser y voltear.");
        
        super.startSleeping(); //Ahora con el metodo super, llamamos al metodo de la super clase (Mammal)...y ahora descansa

    }
    
}