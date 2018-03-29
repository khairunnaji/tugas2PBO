
package tugas2pbo;

public class BajuAksi {
    public static void main(String[] args) {
        baju r1 = new baju();
        r1.Jumlah = 24;
        r1.Harga = 150000;
    
        r1.cetaknfo();
        System.out.println("Hasil Jual = "+r1.Hasil());
        r1.cetakHasil();
    }
}
