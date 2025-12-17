import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, sisa;
        String status;

        n = Integer.parseInt(input.nextLine());
        String[] namaArray = new String[n];
        int[] stokArray = new int[n];
        int[] terjualArray = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArray[i] = input.nextLine();
            stokArray[i] = Integer.parseInt(input.nextLine());
            terjualArray[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        System.out.println("--- HASIL LAPORAN ---");
        System.out.println("Nama" + "   " + "StokAwal" + "   " + "Terjual" + "   " + "Sisa" + "   " + "Status");
        for (i = 0; i <= n - 1; i++) {
            sisa = stokArray[i] - terjualArray[i];
            status = "CekStatus(sisa)";
            System.out.println(namaArray[i] + "" + stokArray[i] + "" + terjualArray[i] + "" + sisa + "" + status);
        }
    }
}
