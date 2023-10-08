import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("belle.dat"));
        int n = f.nextInt();
        f.nextLine();
        while(n-- > 0){
            System.out.println(Math.max(f.nextInt(), f.nextInt()));
        }
    }
}
