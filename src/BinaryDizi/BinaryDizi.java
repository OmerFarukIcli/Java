package BinaryDizi;

import java.util.Arrays;

public class BinaryDizi {

	public static void main(String[] args) {
		// Dizideki en b�y�k say�y� binary y�ntem ile  bulma 
	    System.out.println("Dizideki en b�y�k say�y� binary y�ntem ile  bulma");
		
		      int[] dizi={712,714,804,2140000000,907,105,506,1044,158885,3,54,2001455455,86,2125488474};
		      int ebs=0;// En b�y�k say� ba�lang�� de�eri 0
		      boolean durum; 
		      for(int i=0;i<dizi.length;i++)// Dizi elemanlar�n� s�rayla d�ng�ye sokuyoruz
		      { 
		      durum=false;  
		      int x=0x80000000; 
		      //  1000 0000 0000 0000 0000 0000 0000 0000 say�s�n�n 16 l�k tabandaki kar��l���
		      //  Bu sayede sa�dan bitleri kar��la�t�rarak b�y�k say�y� buluyoruz
		      //  �rne�in ilk x=1100 ile y=1000 kar��la�t�r�rsak 
		      //  sa�dan ilk bitler e�it ama ikinci bitlerde 1 0 dan y�ksek oldu�u i�in
		      //  di�er bitlere bak�lmaks�z�n x  y den b�y�k oluyor
		      //  bu sayede en b�y�k olarak ebs= x oluyor.
		      
		      for(int k=0;k<32;k++)  // �nteger say� 32 bit oldu�u i�in 
		      {
		           if((dizi[i]&x)>(ebs&x))
		           {
		               int y=0x00000001; // Ebs nin yeni de�erini atamak i�in de�i�ken
		               ebs=0;
		               for(int j=0;j<32;j++)
		              { 
		               if((dizi[i]&y)!=0) ebs=ebs|y;  
		                  y=y<<1; // y sola do�r� 1 bi kay�yor
		               }
		              durum=true;
		           }
		           if(durum) break;
		           x=x>>1;// x sa�a do�ru bir bit kay�yor
		                  
		      }
		      }
		      System.out.println(Arrays.toString(dizi));
		      System.out.println("En B�y�k Dizi Eleman�..:"+ebs);


	}

}
