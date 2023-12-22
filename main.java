import java.util.Scanner;

import static java.lang.System.out;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        out.println("\n");
        out.println("============================");
        out.println("Selamat Datang di Minimarket");
        out.println("============================");
        out.println(" Jalan Merpati Ujung No. 19 ");
        out.println("\n");

        out.print("Nama item\t\t\t: ");
        String item = sc.nextLine();
        out.print("Harga barang\t\t: ");
        int price = sc.nextInt();
        out.print("Quantity\t\t\t: ");
        int qty = sc.nextInt();
        double total = qty * price;
        out.println("Total Price\t\t\t: " + total);
        out.print("Jumlah Cash\t\t\t: ");
        double cash = sc.nextDouble();
        double change = cash - total;
        out.print("Jumlah Kembalian\t: " + change);

    }
}