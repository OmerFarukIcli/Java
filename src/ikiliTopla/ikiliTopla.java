package ikiliTopla;

public class ikiliTopla {

	public static void main(String[] args) {
		int x=962255;
	       int parca1=(x+0x00000001)&0x00000fff; // x sayısını 1 ile toplayıp 12. bite kadar etki etmesi için 0x00000fff ile çarptım
	       int parca2=(x-0x00008000)&0x003fc000; // x sayısını 1 ile çıkarıp 15,16,17,18,19,20,21. bitlere etki etmesi için 0x003fc000 ile çarptım ile çarptım
	       int parca3=x&0xffc03000; //ilk 12 bit ve 15,16,17,18,19,20,21. bitleri 0 layıp x ile çarptım
	       int sonuc=parca1|parca2|parca3; // 3 ünü orluyoz
	       System.out.print(sonuc);
	       // 0x00000fff    0000 0000 0000 0000 0000 1111 1111 1111  --> ilk 12 bit
	       // 0x003fc000    0000 0000 0011 1111 1100 0000 0000 0000  --> 15,16,17,18,19,20,21. bitler
	       // ffc03000      1111 1111 1100 0000 0011 0000 0000 0000  --> ilk 12 bit ve 15,16,17,18,19,20,21. bitleri 0 la 

	}

}
