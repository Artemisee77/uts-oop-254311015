public class MadiunMobil extends LayananTransportasi {

    public MadiunMobil(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        // Biaya admin = Rp 3000 + (15 * 100) = 4500
        double biayaAdmin = 4500; 
        return (this.jarak * 5000) + biayaAdmin; // Tarif Rp 5.000/km + Admin
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("Transaksi oleh Abdul Aziz Mushthofa - 254311015");
        System.out.println("Validasi Saldo:");
        
        double totalTarif = hitungTarif();
        
        if (this.saldoUser >= totalTarif) {
            double saldoAwal = this.saldoUser;
            this.saldoUser -= totalTarif;
            System.out.println("Nama Driver : " + this.namaDriver);
            System.out.println("Jarak       : " + this.jarak + " km");
            System.out.println("Saldo Awal   : Rp " + saldoAwal);
            System.out.println("Total Bayar : Rp " + totalTarif);
            System.out.println("Sisa Saldo  : Rp " + this.saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini! saldo anda hanya: " + this.saldoUser + " membutuhkan: " + totalTarif);
        }
    }
}