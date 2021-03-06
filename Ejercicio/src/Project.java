
public class Project {

	private String nombre;

    private String descripcion;
    
    //Sobrecarga de metodo
    public String elevatorPitch(){

    	return nombre + ": " + descripcion;
    	
    }
    
    public String elevatorPitch(String nombre){

    	return nombre;
    	
    }
    
    public String elevatorPitch(String nombre, String descripcion){

    	return nombre + ": " + descripcion;
    	
    }
    
    // getter

    public String getName() {

        return nombre;

    }
    
    public String getDescription() {

        return descripcion;

    }
    
    // setter
    
    public void setName(String name) {

        nombre = name;

    }
    
  public void setDescription(String description) {

        descripcion = description;

    }

  //----------------------------------------------------------------
    
    public Project() {
    	
    }
    
    
    public Project(String name) {

    	this.nombre = name;
    }


    public Project(String nombre, String descripcion) {

   		this.nombre = nombre;
   		this.descripcion = descripcion;

    }
    
}


