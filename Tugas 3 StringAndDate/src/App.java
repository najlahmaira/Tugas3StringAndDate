import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mendapatkan tanggal dan waktu saat ini
        LocalDateTime waktuTransaksi = LocalDateTime.now();

        // Format tanggal transaksi
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = waktuTransaksi.format(formatterDate);

        // Format waktu transaksi
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = waktuTransaksi.format(formatterTime);
            
            try {
            System.out.println("=== SELAMAT DATANG DI MINIMARKET CINTA PBO ===");
            System.out.println("Silakan masukkan informasi pelanggan:");

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = input.nextLine();

            System.out.print("Nomor HP: ");
            String nomorHP = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.println("\nMasukkan informasi pembelian barang:");

            System.out.print("Kode Barang: ");
            String kodeBarang = input.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = input.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang = input.nextDouble();

            System.out.print("Jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            
            System.out.println("\nMasukkan nama kasir:");
            input.nextLine(); // Membersihkan buffer
            String Kasir = input.nextLine();

            double totalBayar = hargaBarang * jumlahBeli;
            

            System.out.println("\n=== MINIMARKET CINTA PBO===");
            System.out.println("Tanggal Transaksi: " + formattedDate);
            System.out.println("Waktu Transaksi: " + formattedTime);
            System.out.println("========================");
            System.out.println("========================");
            System.out.println("DATA PELANGGAN");
            System.out.println("------------------------");
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("No. HP: " + nomorHP);
            System.out.println("Alamat: " + alamat);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("------------------------");
            System.out.println("Kode Barang: " + kodeBarang);
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Harga Barang: " + hargaBarang);
            System.out.println("Jumlah Beli: " + jumlahBeli);
            System.out.println("TOTAL BAYAR: " + totalBayar);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Kasir:" + Kasir );
 
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan. Pastikan input sesuai dengan yang diminta.");
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}


