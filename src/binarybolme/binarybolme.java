package binarybolme;

public class binarybolme {
	/*
	 * Binary sistemdeki say�m�z�n uzunlu�u ka� haneli olursa olsun
	 * say�m�z� 5'e b�lerek sadece kalan 1 olanlar� kabul edip
	 * di�erlerini kab�l etmeyen program 
	 */

	public static void main(String[] args) {
	    String bolunen="100010000100010011100101010101000010";
        String[] bolum={"000","001","010","011","100","101","110","111","1000","1001"};
        String[] kalan={"00","01","10","11","100"};
        String yeni=bolunen.substring(0,3);
           
        for(int i=1;i<=bolunen.length()-3;i++){
            if(yeni.equals(bolum[0])||yeni.equals(bolum[5]))
               yeni=kalan[0]+bolunen.charAt(i+2);
            else if(yeni.equals(bolum[1])||yeni.equals(bolum[6]))
               yeni=kalan[1]+bolunen.charAt(i+2);
            else if(yeni.equals(bolum[2])||yeni.equals(bolum[7]))
               yeni=kalan[2]+bolunen.charAt(i+2);
            else if(yeni.equals(bolum[3])||yeni.equals(bolum[8]))
               yeni=kalan[3]+bolunen.charAt(i+2);
            else if(yeni.equals(bolum[4])||yeni.equals(bolum[9]))
               yeni=kalan[4]+bolunen.charAt(i+2);
                        
       }
        if(yeni.equals(bolum[5]))
            yeni="0"+kalan[0];
        if(yeni.equals(bolum[6]))
            yeni="0"+kalan[1];
        if(yeni.equals(bolum[7]))
            yeni="0"+kalan[2];
        if(yeni.equals(bolum[8]))
            yeni="0"+kalan[3];
        if(yeni.equals(bolum[9]))
            yeni=kalan[4];
        if(yeni.equals("001"))
            System.out.print("Kabul edilebilir dizi Kalan  =   "+yeni);
        else
            System.out.print("Kabul edilemez dizi Kalan  =   "+yeni);

	}

}
