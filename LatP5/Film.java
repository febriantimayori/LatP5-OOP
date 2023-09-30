public class Film {
    private String judul, genre, rate;
    private int jumlahTiket, hargaTiket;

    public Film() {

    }

    public Film(String judul, String genre, String rate, int jumlahTiket, int hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.rate = rate;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void tambahTiket(int n) {
        if (jumlahTiket > 0) {
            jumlahTiket += n;
        }
    }

    public void kurangiTiket(int n) {
        if (jumlahTiket > 0) {
            jumlahTiket -= n;
        }
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public int totalRevenue(int jumlah) {
        return jumlah * hargaTiket;
    }

    public void tampilSisaTiket() {
        System.out.println("Sisa tiket " + judul + ": " + jumlahTiket);
    }
}