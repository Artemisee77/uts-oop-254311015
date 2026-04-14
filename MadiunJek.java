import java.util.ArrayList;

public class MadiunJek {
    public static void main(String[] args) {
        // Membuat koleksi List bertipe kelas Induk (Polymorphism)
        ArrayList<LayananTransportasi> daftarLayanan = new ArrayList<>();

        // Menambahkan objek ke dalam List
        // Test 1: MadiunMotor saldo cukup
        daftarLayanan.add(new MadiunMotor("Bang Dodo", 4.0, 50000)); 
        
        // Test 2: MadiunMobil saldo kurang (Tarif: 5*5000 + 4500 = 29500)
        daftarLayanan.add(new MadiunMobil("Mas Amba", 5.0, 15000)); 
        
        // Test 3: MadiunMobil input jarak negatif (otomatis jadi 1 km, Tarif: 1*5000 + 4500 = 9500)
        daftarLayanan.add(new MadiunMobil("Mas Rusdi", -3.5, 20000));

        int transaksiKe = 1;
        for (LayananTransportasi layanan : daftarLayanan) {
            System.out.println("\n--- Eksekusi Transaksi Ke-" + transaksiKe + " ---");
            layanan.prosesTransaksi();
            transaksiKe++;
        }
    }
}