import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totallolos, junk;
        int status;

        totallolos = 0;
        n = Integer.parseInt(input.nextLine());
        String[] namaArr = new String[n];
        double[] ipkArr = new double[n];
        int[] gajiArr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArr[i] = input.nextLine();
            ipkArr[i] = Double.parseDouble(input.nextLine());
            junk = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        for (i = 0; i <= n - 1; i++) {
            status = CekKelulusan(ipkArr[i], gajiArr[i]);
            System.out.println(namaArr[i] + " -> " + status);
            if (status == "Lolos Syarat Awal") {
                totallolos = totallolos + 1;
            }
        }
        System.out.println("");
        System.out.println("Total pendaftar lolos: " + totallolos);
    }
}
