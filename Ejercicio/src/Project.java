
public class Project {

	private String nombre;

    private String descripcion;
    
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
    	
    	nombre = "Proyecto";
    	descripcion = "Descripcion de proyecto";

    }
    
    
    public Project(String name) {

    	this.nombre = name;
    }


    public Project(String nombre, String descripcion) {

   		this.nombre = nombre;
   		this.descripcion = descripcion;

    }
    
}


