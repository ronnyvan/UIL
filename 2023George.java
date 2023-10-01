import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("george.dat"));
        int n = f.nextInt();
        while(n-- > 0){
            int mpg = f.nextInt();
            int g = f.nextInt();
            int m = f.nextInt(); 

            System.out.println((mpg*g < m) ? "I've got a bad feeling about this" : "Never tell me the odds");
        }
    }
}
