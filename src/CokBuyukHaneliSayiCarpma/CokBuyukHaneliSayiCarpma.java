package CokBuyukHaneliSayiCarpma;

public class CokBuyukHaneliSayiCarpma {

	public static void main(String[] args) {
		// Istedigimiz kadar haneli sayiyi hic bir sinira baglý kalmaksizin carpiyor..
		// En son iki tane onbin haneli sayiyi carpildi
		// Sure olarak 6 7 dakika surdu
		// Klasik carpma islemindeki algoritma kullanildi.
		   String str="4515878854514125454514125449988585421121515454512151512554551451251412544998858788225578785451419";
	       String str2="12155454648484641313515151564884451231321515165161215545454454312132132154848684684865115613215";
	       String[] ere=new String[str.length()];
	    		   String yaz="";
	       int eld=0;
	       int snc;
	        int[][] Carp=new int[10][10];
	        int[][] Elde=new int[10][10];
	       int[][] Toplam=new int[10][10];
	        int[][] TElde=new int[10][10];
	       for(int i=0;i<10;i++)
	           for(int j=0;j<10;j++)
	           {
	               Carp[i][j]=i*j%10;
	               Elde[i][j]=i*j/10;
	               Toplam[i][j]=(i+j)%10;
	               TElde[i][j]=(i+j)/10;
	       
	           }
	       int a=-1;
	       for(int i=str.length()-1;i>=0;i--)
	       {
	           a++;
	           for(int j=str2.length()-1;j>=0;j--)
	           {
	               if(eld==0)
	               {snc=Carp[Integer.parseInt(str.substring(i,i+1))][Integer.parseInt(str2.substring(j,j+1))];
	                    yaz=Integer.toString(snc)+yaz; 
	                    eld=Elde[Integer.parseInt(str.substring(i,i+1))][Integer.parseInt(str2.substring(j,j+1))];
	               }else 
	               {snc=Carp[Integer.parseInt(str.substring(i,i+1))][Integer.parseInt(str2.substring(j,j+1))]+eld;
	               if(snc>=10){ snc=snc%10;
	               eld=(Integer.parseInt(str.substring(i,i+1))*Integer.parseInt(str2.substring(j,j+1))+eld)/10;
	               yaz=Integer.toString(snc)+yaz; 
	               
	               }else
	               {yaz=Integer.toString(snc)+yaz;
	                    eld=Elde[Integer.parseInt(str.substring(i,i+1))][Integer.parseInt(str2.substring(j,j+1))];
	              
	               }}
	                   
	               
	               if(j==0&&eld>0)
	                   yaz=eld+yaz;
	                     
	           }
	           eld=0;
	          if(yaz==null) break;
	           ere[a]=yaz;
	              yaz="";  
	       }
	      
	    int sayi1;
	   String toplaa;
	   String yz="";
	   String sfr="0";
	     toplaa=ere[0];
	     String erem;
	   for(int i=1;i<ere.length;i++){  
	    erem=ere[i]+sfr;
	    sfr=sfr+"0";
	   for(int j=erem.length()-1;j>=0;j--){
	       if(eld==0){
	       while(toplaa.length()!=erem.length()) toplaa="0"+toplaa;  
	      
	   sayi1=Toplam[(int)toplaa.charAt(j)-(int)'0'][(int)erem.charAt(j)-(int)'0'];
	   yz=Integer.toString(sayi1)+yz;
	   eld=TElde[(int)toplaa.charAt(j)-(int)'0'][(int)erem.charAt(j)-(int)'0'];
	       }else
	       {
	        sayi1=Toplam[(int)toplaa.charAt(j)-(int)'0'][(int)erem.charAt(j)-(int)'0']+eld;
	        if(sayi1==10){sayi1=0;eld=1;yz=Integer.toString(sayi1)+yz; }
	        else{
	   yz=Integer.toString(sayi1)+yz;
	   eld=TElde[(int)toplaa.charAt(j)-(int)'0'][(int)erem.charAt(j)-(int)'0'];}
	       }
	        if(j==0&&eld>0)
	          yz=eld+yz;
	  
	   } toplaa=yz; yz=""; eld=0;
	      
	   } System.out.println("Sonuc.......:"+toplaa);
	   System.out.println("<=======================================>");
	   System.out.println("Birinci sayi basamak sayisi..:"+str.length());
	   System.out.println("Ikinci sayi basamak sayisi...:"+str2.length());
	   System.out.println("Sonuc basamak sayisi.........:"+toplaa.length());
	   
	   

	}

}
