public class MadiunMotor extends LayananTransportasi {

    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser); // Memanggil constructor class induk
    }

    @Override
    public double hitungTarif() {
        return this.jarak * 2500; // Tarif Rp 2.500/km
    }

    @Override
    public void prosesTransaksi() {
        // Output Wajib sesuai format
        System.out.println("Transaksi oleh Abdul Aziz Mushthofa - 254311015");
        System.out.println("Validasi Saldo:");
        
        double totalTarif = hitungTarif();
        
        // Logika validasi pembayaran
        if (this.saldoUser >= totalTarif) {
            this.saldoUser -= totalTarif; // Kurangi saldo
            System.out.println("Nama Driver : " + this.namaDriver);
            System.out.println("Jarak       : " + this.jarak + " km");
            System.out.println("Total Bayar : Rp " + totalTarif);
            System.out.println("Sisa Saldo  : Rp " + this.saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}