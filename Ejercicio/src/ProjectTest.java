
public class ProjectTest {

	public static void main(String[] args) {

		//Project proyecto = new Project();
		//String name = proyecto.getName();
		//String description = proyecto.getDescription();
		//String info = proyecto.elevatorPitch(name, description);
		//System.out.println(info);

		//-------------------------------------------------------------
		
		//Project proyecto = new Project("Proyecto 2");
        //String name = proyecto.getName();
        //System.out.println(name);
		
		//-------------------------------------------------------------
		
		Project proyecto = new Project();
		String info = proyecto.elevatorPitch(proyecto.getName(), proyecto.getDescription());
		System.out.println(info);
		
	}

}
