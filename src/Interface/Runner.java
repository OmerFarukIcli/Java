package Interface;

public class Runner implements InterfaceCocuk1,InterfaceAna2 {

	public static void main(String[] args) {
		Runner rnr=new Runner();
		System.out.print(rnr.ad());
		rnr.yaz();
		System.out.print(rnr.yas());
		System.out.print(InterfaceCocuk1.OKUL);
		System.out.print(InterfaceAna2.SINIF);
		System.out.print(InterfaceCocuk1.SAYI);
		

	}

	@Override
	public void yaz() {
		System.out.print("Yaz");
		
	}

	@Override
	public int yas() {
		
		return 10;
	}

	@Override
	public String ad() {
		
		return "Ad";
	}

	@Override
	public int hiz() {
		
		return 24;
	}

	@Override
	public void statu() {
		
		System.out.print("Statu");
		
	}

}
