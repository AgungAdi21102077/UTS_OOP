
package mobilku;
import java.util.Scanner;

/**
 * UTS OOP
 * Nama I Gusti Agung Adi Novayoga_
 * Nim 21102077
 */
public class Mobilku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         mobilclass mbl = new mobilclass();
         Scanner dtIN = new Scanner(System.in); 
         
         System.out.print("Warna Mobil :");
         String nama = dtIN.nextLine();
         mbl.Setwarna(nama);
         
          
         System.out.print("Tipe Mobil Anda :");
         String tipe = dtIN.nextLine();
         mbl.Setjenis(tipe);
        
          
         System.out.print("Merek Mobil Anda :");
         String MEREK = dtIN.nextLine();
         mbl.Setmerek(MEREK);
        
         System.out.print("Tahun Produksi Mobil Andas :");
         int umur = dtIN.nextInt();
         mbl.Getumur();
         mbl.kurang(2022, 2018);
         System.out.println("USIA MOBIL ANDA SAAT INI : "+ mbl.getHASIL());
         
        System.out.println("=============Data Mobil Anda============ ");
        System.out.println("Warna Mobil: " + nama);
        System.out.println("Tipe Mobil : " + tipe);
        System.out.println("Merek Mobil : " + MEREK);
        System.out.println("Tahun Produksi Mobil : " + umur);
        System.out.println("===========Data Mobil Tersimpan=========");

}
}
