import java.io.*;

public class MainApp {

	private static User arrayUsers[] = new User[10];
	private static int numUsers = 0;
	private static int numCursos = 0;
	private static Curso arrayCurso[] = new Curso[10];
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args){
		int option = showMenu();
		while(option != 0){
			switch(option){
				case 1:
					User u = addNewUser();
					arrayUsers[numUsers] = u;					
					numUsers++;
					break;
				case 2:
					for(int i=0;i<numUsers;i++){
						arrayUsers[i] = null;
					}
					break;
				case 3:
					Curso c = addNewCurso();
					arrayCurso[numCursos] = c;					
					numCursos++;
					break;
				case 4: 
					for(int i=0;i<numCursos;i++){
						arrayCurso[i] = null;
					}
					break;
				case 3:	
					for(int i = 0 ; i < numUsers; i++){
						arrayUsers[i] = null;
					}
					break;
			}
			option = showMenu();
		}

	}

	/**
	 * Displays a menu and returns option selected
	 * @return option selected
	 */
	public static int showMenu() {
		int result = -1;
		boolean readingError = true;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(readingError){
			System.out.println("\tMenu");
			System.out.println("==========");
			System.out.println("1. - Add new User");
			System.out.println("2. - Delete User (TODO)");
			System.out.println("3. - Add new Curs");
			System.out.println("4. - Delete Curs (TODO)");
			System.out.println("0. - Exit");
			try{
				String option = buffer.readLine();	
				result = Integer.parseInt(option);
				readingError = false;
			}catch(Exception e){
				readingError = true;
			}
		}		
		return result;
	}

	/**
	 * Asks user for User properties and creates a new one
	 * @return
	 */
	public static User addNewUser() {
		int id, age; id = age = -1;
		String name, surname; name = surname = "";
		boolean readingError;
		do {
			try{
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				System.out.println("Surname:");
				surname = buffer.readLine();
				System.out.println("age:");
				age = Integer.parseInt(buffer.readLine());
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		User u = new User(id, name, surname, age);
		return u;
	}
	
	public static Curso addNewCurso() {
		int id =  -1;
		String name = "";
		boolean readingError;
		do {
			try{
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		Curso c = new Curso(id, name);
		return c;
	}

}