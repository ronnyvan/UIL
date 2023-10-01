//better way
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("krishna.dat"));
        int n = f.nextInt();
        f.nextLine();

        while(n-- > 0){
            int lower = f.nextInt();
            int upper = f.nextInt();
            int sum = 0;

            for(int i = lower; i <= upper; i++){
                sum += (i*(i+1))/2;
            }
            System.out.println(sum);
        }
    }
}

//recursion
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("krishna.dat"));
        int n = f.nextInt();
        for(int i =0 ; i < n; i++){
            int x = f.nextInt();
            int y = f.nextInt();
            int total = 0;
            for(int j = x; j <= y; j++){
                total += sumToZero(j);
            }
            System.out.println(total);
        }
    }
    public static int sumToZero(int x){
        if(x == 1){
            return 1;
        } else return x + sumToZero(x-1);
    }
}
