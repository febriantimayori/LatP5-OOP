import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Film film1 = new Film("Quantumania Mancing", "Action Comedy", "Remaja", 30, 40000);
        Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 20, 40000);
        Film film3 = new Film("A Man Called Otto", "Drama", "Dewasa", 15, 35000);

        Snack snack1 = new Snack("Popcorn", 15000);
        Snack snack2 = new Snack("Minuman", 10000);

        int totalPembayaranFilm = 0;
        int totalPembayaranSnack = 0;
        int totalPembayaranKeseluruhan = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Lihat Sisa Tiket Film");
            System.out.println("2. Beli Tiket Film");
            System.out.println("3. Beli Snack");
            System.out.println("4. Total Bayar");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Sisa Tiket Film:");
                film1.tampilSisaTiket();
                film2.tampilSisaTiket();
                film3.tampilSisaTiket();
            } else if (menu == 2) {
                System.out.println("Daftar Film:");
                System.out.println("1. " + film1.getJudul() + " - Harga Tiket: " + film1.getHargaTiket());
                System.out.println("2. " + film2.getJudul() + " - Harga Tiket: " + film2.getHargaTiket());
                System.out.println("3. " + film3.getJudul() + " - Harga Tiket: " + film3.getHargaTiket());
                System.out.print("Pilih film yang ingin dibeli: ");
                int pilihanFilm = input.nextInt();

                int jumlahTiket = 0;
                Film filmTerpilih = null;

                if (pilihanFilm == 1) {
                    filmTerpilih = film1;
                } else if (pilihanFilm == 2) {
                    filmTerpilih = film2;
                } else if (pilihanFilm == 3) {
                    filmTerpilih = film3;
                } else {
                    System.out.println("Pilihan film tidak valid.");
                    continue;
                }

                filmTerpilih.tampilSisaTiket();

                System.out.print("Jumlah tiket yang ingin dibeli: ");
                jumlahTiket = input.nextInt();

                if (jumlahTiket <= filmTerpilih.getJumlahTiket()) {
                    filmTerpilih.tambahTiket(jumlahTiket);
                    totalPembayaranFilm += filmTerpilih.totalRevenue(jumlahTiket);
                } else {
                    System.out.println("Maaf, jumlah tiket yang diminta melebihi sisa tiket yang tersedia.");
                }
            } else if (menu == 3) {
                while (true) {
                    System.out.println("Daftar snack:");
                    System.out.println("1. " + snack1.getNamaSnack() + " - Harga: " + snack1.getHargaSnack());
                    System.out.println("2. " + snack2.getNamaSnack() + " - Harga: " + snack2.getHargaSnack());
                    System.out.print("Pilih snack yang ingin dibeli: ");
                    int pilihanSnack = input.nextInt();

                    int jumlahSnack = 0;
                    Snack snackTerpilih = null;

                    if (pilihanSnack == 1) {
                        snackTerpilih = snack1;
                    } else if (pilihanSnack == 2) {
                        snackTerpilih = snack2;
                    } else {
                        System.out.println("Pilihan snack tidak valid.");
                        break;
                    }

                    System.out.print("Jumlah snack yang ingin dibeli: ");
                    jumlahSnack = input.nextInt();
                    snackTerpilih.tambahSnack(jumlahSnack);
                    totalPembayaranSnack += snackTerpilih.totalPembayaranSnack();

                    System.out.print("Apakah ingin membeli snack lain? (1 = Ya, 0 = Tidak): ");
                    int beliLagi = input.nextInt();
                    if (beliLagi == 0) {
                        break;
                    }
                }
            } else if (menu == 4) {
                totalPembayaranKeseluruhan = totalPembayaranFilm + totalPembayaranSnack;
                System.out.println("Total bayar tiket film: " + totalPembayaranFilm);
                System.out.println("Total bayar snack: " + totalPembayaranSnack);
                System.out.println("Total bayar keseluruhan: " + totalPembayaranKeseluruhan);
            } else if (menu == 5) {
                System.out.println("Terima kasih. Keluar dari program.");
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
        input.close();
    }
}
