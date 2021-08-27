package AbsctractOrnek;

public class Torun1 extends Abstractcocuk {

	public static void main(String[] args) {
		new Torun1().EkranYaz();

	}

	@Override
	public void Statu() {
	  System.out.print("Idare");
		
	}

	@Override
	public void Gorev() {
		System.out.print("Mudýr");
		
	}

	@Override
	public void isimyaz() {
		System.out.print("Mehmet");
		
	}

	@Override
	public int yas() {
		return 30;
	}
	

}
