
public class Main {

	public static void main(String[] args) {
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();

	}

}
