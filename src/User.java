public class User {
	private int id; 
	private String name;
	private String surname;
	private int age;

	public User(int id,String name,String surname,int age){
		this.age = age;
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public int getAge() {
	    return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
 
	public String getSurname() {
	    return this.surname;
	}
	
	public void setSurname(String surname) {
	    this.surname = surname;
	}
	
	public String getName() {
	    return this.name;
	}
	
	
	public void setName(String name) {
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
	
	public String getSurname() {
	    return this.surname;
	}
	
	public void setSurame(String surname){
		this.surname = surname;
	}

	public String toString(){
		return "+id: " + this.id + "\n+Name: " + this.name + "\n+Surname: " + this.surname + "\n+age:" + this.age;
	}

}