import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("=== Daftar Menu Kafe ===");
        for(String item : menu) {
            System.out.println("- " +item);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for(int i=0; i<menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(cari+ " tersedia di menu kafe.");
        } else {
            System.out.println("maaf, "+cari+ " tidak ada di menu kafe.");
        }
    }
}
