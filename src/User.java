public class User {
	private int id; 
	private String name;
	private String surname;
	private int age;

	public int getAge() {
	    return this.age;
	}
 setSurname(String surname) {
	    this.surname = surname;
	}

	public voi
	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String toString(){
		return "+id: " + this.id + "\n+Name: " + this.name + "\n+Surname: " + this.surname + "\n+age:" + this.age;
	}

}