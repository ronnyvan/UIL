import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("janice.dat"));
        int n = Integer.parseInt(f.nextLine());
        for (int i = 0; i < n; i++) {
            String actualString = f.nextLine();
            String key = f.nextLine();
            String decode = f.nextLine();
            String ret = "";
            int shift = -1 * key.charAt(0) + actualString.charAt(0);
            for (int j = 0; j < decode.length(); j++) {
                if (decode.charAt(j) == ' ') {
                    ret += " ";
                } else {
                    char originalChar = decode.charAt(j);
                    char shiftedChar = (char) ((originalChar - 'A' + shift + 26) % 26 + 'A');
                    ret += shiftedChar;
                }
            }
            System.out.println(ret);
        }
    }
}
