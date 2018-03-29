
package tugas2pbo;
public class baju {
    double Jumlah;
    double Harga;
    
    void cetaknfo(){
        System.out.println("------------------------");
        System.out.println("Jumlah : "+Jumlah);
        System.out.println("Harga : "+Harga);
        System.out.println("------------------------");
       
    }
    double Hasil(){
        double Hasil;
       Hasil=Jumlah*Harga;
       return Hasil;
    }
    void cetakHasil(){
        System.out.println("Hasil Jual Yaitu :"+Hasil());
    }
}
