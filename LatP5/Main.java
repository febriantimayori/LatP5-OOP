import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Film film1 = new Film("Quantumania Mancing", "Action Comedy", "Remaja", 40000);
        Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 40000);
        Film film3 = new Film("A Man Called Otto", "Drama", "Dewasa", 35000);

        Snack snack1 = new Snack("Popcorn Asin", 15000);
        Snack snack2 = new Snack("Popcorn Manis", 20000);
        Snack snack3 = new Snack("Sprite", 10000);
        Snack snack4 = new Snack("Coca Cola", 15000);

        Kasir kasir = new Kasir();

        Pembeli pembeli = null; // Inisialisasi objek pembeli

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Beli Tiket Film");
            System.out.println("2. Beli Snack");
            System.out.println("3. Total Bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int menu = input.nextInt();

            if (menu == 1) {
                input.nextLine();  // Membuang karakter newline

                // Pengisian data diri
                System.out.print("Masukkan nama: ");
                String nama = input.nextLine();
                System.out.print("Masukkan nomor HP: ");
                String noHP = input.nextLine();
                System.out.print("Masukkan alamat: ");
                String alamat = input.nextLine();

                // Membuat objek Pembeli
                pembeli = new Pembeli(nama, noHP, alamat);

                System.out.println("Daftar Film:");
                System.out.printf("1. %-40s Harga Tiket: %d\n", film1.getJudul(), film1.getHargaTiket());
                System.out.printf("2. %-40s Harga Tiket: %d\n", film2.getJudul(), film2.getHargaTiket());
                System.out.printf("3. %-40s Harga Tiket: %d\n", film3.getJudul(), film3.getHargaTiket());
                System.out.print("Pilih film yang ingin dibeli: ");
                int pilihanFilm = input.nextInt();

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

                System.out.print("Jumlah tiket yang ingin dibeli: ");
                int jumlahTiket = input.nextInt();
                int totalPembayaranFilm = filmTerpilih.getHargaTiket() * jumlahTiket;

                kasir.tambahStruk(String.format("| Tiket Film: %-32s | %,5d |", filmTerpilih.getJudul(), totalPembayaranFilm));
                kasir.tambahTotalPembayaranFilm(totalPembayaranFilm);

                System.out.println("Pembelian tiket film berhasil.");
            } else if (menu == 2) {
                while (true) {
                    System.out.println("Daftar Snack:");
                    System.out.printf("1. %-40s Harga: %d\n", snack1.getNamaSnack(), snack1.getHargaSnack());
                    System.out.printf("2. %-40s Harga: %d\n", snack2.getNamaSnack(), snack2.getHargaSnack());
                    System.out.printf("3. %-40s Harga: %d\n", snack3.getNamaSnack(), snack3.getHargaSnack());
                    System.out.printf("4. %-40s Harga: %d\n", snack4.getNamaSnack(), snack4.getHargaSnack());
                    System.out.print("Pilih snack yang ingin dibeli (0 untuk selesai): ");
                    int pilihanSnack = input.nextInt();

                    if (pilihanSnack == 0) {
                        break;
                    }

                    Snack snackTerpilih = null;

                    if (pilihanSnack == 1) {
                        snackTerpilih = snack1;
                    } else if (pilihanSnack == 2) {
                        snackTerpilih = snack2;
                    } else if (pilihanSnack == 3) {
                        snackTerpilih = snack3;
                    } else if (pilihanSnack == 4) {
                        snackTerpilih = snack4;
                    } else {
                        System.out.println("Pilihan snack tidak valid.");
                        continue;
                    }

                    System.out.print("Jumlah snack yang ingin dibeli: ");
                    int jumlahSnack = input.nextInt();
                    int totalPembayaranSnack = snackTerpilih.getHargaSnack() * jumlahSnack;

                    kasir.tambahStruk(String.format("| Snack: %-37s | %,5d |", snackTerpilih.getNamaSnack(), totalPembayaranSnack));
                    kasir.tambahTotalPembayaranSnack(totalPembayaranSnack);

                    System.out.println("Pembelian snack berhasil.");
                }
            } else if (menu == 3) {
                kasir.cetakStruk();
            } else if (menu == 4) {
                if (pembeli != null) {
                    System.out.println("Terima kasih, " + pembeli.getNama() + ". Keluar dari program.");
                } else {
                    System.out.println("Terima kasih. Keluar dari program.");
                }
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
        input.close();
    }
}
