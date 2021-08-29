package DüsükYüksekSeviyeliKarsilastirma;

public class HighLowBinaryBit {

	public static void main(String[] args) {
		// Dizi içerisindeki int deðiþkenlerin 
		// ilk 16(High) son 16(Low) bitlerini  karþýlaþtýrarak
		// Eðer yüksek seviyeli düþük seviyeli bitlerden büyükse ekrana yazdýrýr.
		// Örnek:393218 => 0000 0000 0000 0110 > 0000 0000 0000 0010
		//                   YÜKSEK SEVÝYE(3)  >   DÜÞÜK SEVÝYE(2)
		
		int[] dizi={163841,196609,506,393218,1044,158885,3,54,16915,32768,86,65536,65539};
        for(int i=0;i<dizi.length;i++){ 
          int x=0x80000000;
          int y=0x00008000;
    for(int k=0;k<16;k++)   
    {
        if((dizi[i]&x)!=0&&(dizi[i]&y)!=0)
            continue;
         if((dizi[i]&x)>(dizi[i]&y))
            System.out.println(dizi[i]);
         if((dizi[i]&x)<(dizi[i]&y))
            break;
         x=x>>1; y=y>>1;
    }

	}

	}
}
