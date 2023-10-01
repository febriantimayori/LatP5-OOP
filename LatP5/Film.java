public class Film {
    private String judul, genre, rate;
    private int hargaTiket;

    public Film() {

    }

    public Film(String judul, String genre, String rate, int hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.rate = rate;
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

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

}