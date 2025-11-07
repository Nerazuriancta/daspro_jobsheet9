import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPsn = sc.nextInt();
        sc.nextLine();

        String[] namaPsn = new String[jumlahPsn];
        double[] hargaPsn = new double[jumlahPsn];

        double totalBiaya = 0;

        for(int i=0; i<jumlahPsn; i++) {
            System.out.println("\nPesanan ke-"+(i+1));

            System.out.print("Masukkan nama makanan/minuman: ");
            namaPsn[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPsn[i] = sc.nextDouble();
            sc.nextLine();

            totalBiaya += hargaPsn[i];
        }

        System.out.println("\n=== DAFTAR PESANAN ===");
        for(int i=0; i<jumlahPsn; i++) {
            System.out.println((i+1)+ ". "+namaPsn[i]+ " - Rp "+hargaPsn[i]);
        }

        System.out.println("-----------------------------------");
        System.out.println("Total biaya: Rp "+totalBiaya);
    }
}