package constractor;
class Person{
	public void talk() {
		System.out.print("Omer Faruk I�li");
	}
	
	
}
public class overriding extends Person {
	public void talk() {
		System.out.print("Sefa I�li");
	}
	public void kalk() {
		System.out.print("Faruk I�li");
	}

	public static void main(String[] args) {
		Person over=new overriding();
		over.talk();
		

	}

}
