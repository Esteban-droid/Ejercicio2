class Person {

    //private int age;

    //private String name;

    //public Person(int ageParam, String nameParam) {

        //this.age = ageParam;

        //this.name = nameParam;
        
    //-------this...Lo mismo que esto--------------
        
        //private int age;

        //private String name;

        //public Person(int ageParam, String nameParam) {

        //    age = ageParam;

        //    name = nameParam;

        //}   
	
	//----------Se debe utilizar this si o si cuando los parametros se llaman igual que la varibale
	
	//private int age;

    //private String name;

    //public Person(int age, String name) {

    //    this.age = age;

    //    this.name = name;


    //}
    
  //-------Sobrecarga de constructor--------------
	
	private int age;

    private int cmHeight;

    private String name;

    public Person() {

        this(20, "John Doe", 171);

    }

    

    public Person(int age, String name, int cmHeight) {

        this.age = age;

        this.name = name;

        this.cmHeight = cmHeight;

    }

    //------------Super clase Object-----------------------
	
	//private int age;

    //private String name;

    //public Person(int ageParam, String nameParam) {

    //    this.age = ageParam;

    //    this.name = nameParam;

    //}

    //public void objectMethods(Person anotherObject) {

    //    System.out.println("getClass: " + this.getClass().getSimpleName());

    //    System.out.println("toString: " + this.toString());

    //    System.out.println("Equals: " + this.equals(anotherObject));

    //}
	
}
    