import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("hisoka.dat"));
        int t = f.nextInt();    
        for(int i = 0; i < t; i ++){
            double monthly = f.nextDouble();
            double apr = f.nextDouble();
            int year = f.nextInt();
            double r = apr/1200;
            int n = year*12;

            double v = monthly * (Math.pow(1+r, n)-1)/r;
            double totalCost = monthly*n;
            double totalInterest = v - totalCost;
            System.out.printf("%.2f %.2f %.2f\n", totalCost, totalInterest, v);
        }    
    }
}
