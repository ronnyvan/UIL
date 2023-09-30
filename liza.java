import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("liza.dat"));
        int n = Integer.parseInt(f.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(f.nextLine());
            int m = Integer.parseInt(f.nextLine());
            int[] grades = new int[m];
            String[] names = new String[m];
            double sum = 0;

            for (int j = 0; j < m; j++) {
                String line = f.nextLine();
                String[] split = line.split(",");
                grades[j] = Integer.parseInt(split[2]);
                names[j] = split[1] + " " +split[0];
                sum += grades[j];
            }

            for(int j = 0; j < m; j++){
                if (grades[j] == three(grades)[1] || grades[j] == three(grades)[2] || grades[j] == three(grades)[0]){
                    System.out.println(names[j] + ": " + grades[j]);
                }
            }
            Arrays.sort(grades);
            double med = ( m%2 == 0 ) ? (double)(grades[m/2 - 1] + grades[m/2])/2.0 : (double)grades[m/2];

            System.out.printf("MEAN SCORE: %.2f\n", (double) sum / m);
            System.out.println("Median Score: " + med);
            System.out.println();
        }
    }

    public static int[] three(int[] x) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : x) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        return new int[] { max1, max2, max3 };
    }

}
