import java.util.ArrayList;
import java.util.List;

public class Kasir {
    private List<String> strukPembelian = new ArrayList<>();
    private int totalPembayaranFilm = 0;
    private int totalPembayaranSnack = 0;

    public void tambahStruk(String struk) {
        strukPembelian.add(struk);
    }

    public void tambahTotalPembayaranFilm(int total) {
        totalPembayaranFilm += total;
    }

    public void tambahTotalPembayaranSnack(int total) {
        totalPembayaranSnack += total;
    }

    private int hitungTotalPembayaranKeseluruhan() {
        return totalPembayaranFilm + totalPembayaranSnack;
    }

    public void cetakStruk() {
        System.out.println("+------------------- Struk Pembelian -------------------+");
        System.out.printf("| %-44s | %-6s |\n", "Deskripsi", "Harga");
        System.out.println("|-------------------------------------------------------|");
        for (String struk : strukPembelian) {
            System.out.println(struk);
        }
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| %-44s | %-6d |\n", "Total Bayar Keseluruhan", hitungTotalPembayaranKeseluruhan());
        System.out.println("+-------------------------------------------------------+");
    }
}
