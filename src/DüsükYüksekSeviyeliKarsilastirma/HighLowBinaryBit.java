package D�s�kY�ksekSeviyeliKarsilastirma;

public class HighLowBinaryBit {

	public static void main(String[] args) {
		// Dizi i�erisindeki int de�i�kenlerin 
		// ilk 16(High) son 16(Low) bitlerini  kar��la�t�rarak
		// E�er y�ksek seviyeli d���k seviyeli bitlerden b�y�kse ekrana yazd�r�r.
		// �rnek:
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
