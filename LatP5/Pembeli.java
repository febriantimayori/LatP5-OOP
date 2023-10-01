public class Pembeli {
    private String nama, noHP, alamat;

    public Pembeli(String nama, String noHP, String alamat) {
        this.nama = nama;
        this.noHP = noHP;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getAlamat() {
        return alamat;
    }
}
