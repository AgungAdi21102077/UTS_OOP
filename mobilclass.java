
package mobilku;

/**
 * UTS OOP
 * Nama I Gusti Agung Adi Novayoga_
 * Nim 21102077
 */
public class mobilclass {
    private String warna, jenis, merek ;
    private int Usia ;
    private double hasil;
    
    public void Setwarna(String WARNA){
        this.warna = WARNA;
    }
    public void Setjenis(String JENIS) {
        this.jenis = JENIS;
    }
    public void Setmerek(String MEREK) {
        this.merek = MEREK;
    }
    public void SetPapan(int TAHUN) {
        this.Usia = TAHUN;
    }
    public void kurang(double bil1, double bil2) {
        this.hasil = bil1 - bil2;
    }
    public String Getwarna(){
        return this.warna;
    }
    public String Gettipe(){
        return this.jenis;
    }
    public String Getmerek(){
        return this.merek;
    }
    public int Getumur(){
        return this.Usia;
    }
    public double getHASIL(){
        return this.hasil;
    }
}