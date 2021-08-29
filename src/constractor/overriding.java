package constractor;
class Person{
	public void talk() {
		System.out.print("Omer Faruk Içli");
	}
	
	
}
public class overriding extends Person {
	public void talk() {
		System.out.print("Sefa Içli");
	}
	public void kalk() {
		System.out.print("Faruk Içli");
	}

	public static void main(String[] args) {
		Person over=new overriding();
		over.talk();
		

	}

}
