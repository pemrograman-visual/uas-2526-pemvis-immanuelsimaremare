import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, max, min, countHigh, rating, sum;
        double rata;
        String daftarrating;

        n = Integer.parseInt(input.nextLine());
        sum = 0;
        countHigh = 0;
        min = 100;
        max = -1;
        daftarrating = "daftarrating";
        for (i = 0; i <= n; i++) {
            rating = Integer.parseInt(input.nextLine());
            daftarrating = daftarrating + "" + rating;
            sum = sum + rating;
            if (rating > max) {
                max = rating;
            }
            if (rating < min) {
                rating = min;
            }
            if (rating >= 4) {
                countHigh = countHigh + 1;
            }
        }
        rata = (double) sum / n;
        System.out.println(daftarrating);
        System.out.println("Rata-rata: " + toFixed(rata,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Reviewer rating >=4: " + countHigh + " orang");
        System.out.println(CekStatus(rata));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
