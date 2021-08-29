package BinaryDizi;

import java.util.Arrays;

public class BinaryDizi {

	public static void main(String[] args) {
		// Dizideki en büyük sayýyý binary yöntem ile  bulma 
	    System.out.println("Dizideki en büyük sayýyý binary yöntem ile  bulma");
		
		      int[] dizi={712,714,804,2140000000,907,105,506,1044,158885,3,54,2001455455,86,2125488474};
		      int ebs=0;// En büyük sayý baþlangýç deðeri 0
		      boolean durum; 
		      for(int i=0;i<dizi.length;i++)// Dizi elemanlarýný sýrayla döngüye sokuyoruz
		      { 
		      durum=false;  
		      int x=0x80000000; 
		      //  1000 0000 0000 0000 0000 0000 0000 0000 sayýsýnýn 16 lýk tabandaki karþýlýðý
		      //  Bu sayede saðdan bitleri karþýlaþtýrarak büyük sayýyý buluyoruz
		      //  Örneðin ilk x=1100 ile y=1000 karþýlaþtýrýrsak 
		      //  saðdan ilk bitler eþit ama ikinci bitlerde 1 0 dan yüksek olduðu için
		      //  diðer bitlere bakýlmaksýzýn x  y den büyük oluyor
		      //  bu sayede en büyük olarak ebs= x oluyor.
		      
		      for(int k=0;k<32;k++)  // Ýnteger sayý 32 bit olduðu için 
		      {
		           if((dizi[i]&x)>(ebs&x))
		           {
		               int y=0x00000001; // Ebs nin yeni deðerini atamak için deðiþken
		               ebs=0;
		               for(int j=0;j<32;j++)
		              { 
		               if((dizi[i]&y)!=0) ebs=ebs|y;  
		                  y=y<<1; // y sola doðrý 1 bi kayýyor
		               }
		              durum=true;
		           }
		           if(durum) break;
		           x=x>>1;// x saða doðru bir bit kayýyor
		                  
		      }
		      }
		      System.out.println(Arrays.toString(dizi));
		      System.out.println("En Büyük Dizi Elemaný..:"+ebs);


	}

}
