public class Curso {
	private int id; 
	private String name;

	public Curso(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getName() {
	    return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "+id: " + this.id + "\n+Name: " + this.name;
	}

}