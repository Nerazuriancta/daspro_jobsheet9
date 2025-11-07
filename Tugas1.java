import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int [jumlahMhs];

        int total=0;

        for(int i=0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        double rata = total/jumlahMhs;
        
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for(int i=1; i<jumlahMhs; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("\n=== HASIL ===");
        System.out.println("Semua nilai mahasiswa: ");
        for(int i=0; i<jumlahMhs; i++) {
            System.out.println("Nilai ke-"+(i+1)+": "+nilaiMhs[i]);
        }

        System.out.println("\nRata-rata nilai: " +rata);
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);
    }
}
