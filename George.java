import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("george.dat"));
        int x = f.nextInt();
        for(int i = 0; i < x; i++){
            int mpg = f.nextInt(); // mi / g, -> *g -> mi
            int gal = f.nextInt(); // if above >= miles; then w egood
            int miles = f.nextInt();

            if(mpg*gal >= miles){
                System.out.println("Never tell me the odds.");
            }
            else System.out.println("I've got a bad feeling about this.");
        }
    }
}
