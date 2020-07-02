//Singleton Class
public class SingleObject {
	
	//Create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	//Constructor is private so that this class cannot be instantiated
	private SingleObject() {
		
	};
	
	//Get the object
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		
		System.out.println("Testing 123");
	}

}
