package Singleton_Pattern.Creational_Singleton;
public class SingletonPatternDemo {

	public static void main(String[] args) {
          
	      SingleObject object = SingleObject.getInstance();
	      object.showMessage();
	   }
}
