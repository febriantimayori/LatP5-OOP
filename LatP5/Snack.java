public class Snack {
    private String namaSnack;
    private int hargaSnack, jumlahSnack;

    public Snack(String namaSnack, int hargaSnack) {
        this.namaSnack = namaSnack;
        this.hargaSnack = hargaSnack;
        this.jumlahSnack = 0;
    }

    public String getNamaSnack() {
        return namaSnack;
    }

    public void setNamaSnack(String namaSnack) {
        this.namaSnack = namaSnack;
    }

    public int getHargaSnack() {
        return hargaSnack;
    }

    public void setHargaSnack(int hargaSnack) {
        this.hargaSnack = hargaSnack;
    }

    public int getJumlahSnack() {
        return jumlahSnack;
    }

    public void tambahSnack(int n) {
        jumlahSnack += n;
    }

    public void kurangiSnack(int n) {
        if (jumlahSnack >= n) {
            jumlahSnack -= n;
        } else {
            System.out.println("Stok snack tidak mencukupi.");
        }
    }

    public int totalPembayaranSnack() {
        return jumlahSnack * hargaSnack;
    }
}
