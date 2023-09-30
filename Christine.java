import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("christine.dat"));
        int y = f.nextInt();
        for(int i = 0; i < 5; i ++){
            int x = y;
            y = f.nextInt();


            if(y > x){
                while(x <= y){
                    System.out.print(x + " ");
                    x++;
                }
            }
            else if(y < x){
                while(x >= y){
                    System.out.print(x + " ");
                    x--;
                }
            }
            else{
                System.out.print(x);
            }

            System.out.println();
        }
    }
}
