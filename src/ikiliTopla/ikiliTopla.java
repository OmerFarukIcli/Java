package ikiliTopla;

public class ikiliTopla {

	public static void main(String[] args) {
		int x=962255;
	       int parca1=(x+0x00000001)&0x00000fff; // x say�s�n� 1 ile toplay�p 12. bite kadar etki etmesi i�in 0x00000fff ile �arpt�m
	       int parca2=(x-0x00008000)&0x003fc000; // x say�s�n� 1 ile ��kar�p 15,16,17,18,19,20,21. bitlere etki etmesi i�in 0x003fc000 ile �arpt�m ile �arpt�m
	       int parca3=x&0xffc03000; //ilk 12 bit ve 15,16,17,18,19,20,21. bitleri 0 lay�p x ile �arpt�m
	       int sonuc=parca1|parca2|parca3; // 3 �n� orluyoz
	       System.out.print(sonuc);
	       // 0x00000fff    0000 0000 0000 0000 0000 1111 1111 1111  --> ilk 12 bit
	       // 0x003fc000    0000 0000 0011 1111 1100 0000 0000 0000  --> 15,16,17,18,19,20,21. bitler
	       // ffc03000      1111 1111 1100 0000 0011 0000 0000 0000  --> ilk 12 bit ve 15,16,17,18,19,20,21. bitleri 0 la 

	}

}
