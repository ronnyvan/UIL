import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("miguel.dat"));
        int n = f.nextInt();
        f.nextLine();
        while (n-- > 0) {
            ArrayList<Character> chars = new ArrayList<>();
            String s = f.nextLine();
            
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (Character.isAlphabetic(c)) {
                    chars.add(c);
                }
            }

            Collections.sort(chars, (a, b) -> Character.toLowerCase(a) - Character.toLowerCase(b));
            String ret = "";
            for (int i = 0, j = 0;  i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (Character.isUpperCase(c)) {
                        ret += Character.toUpperCase(chars.get(j++));
                    } else {
                        ret += Character.toLowerCase(chars.get(j++));
                    }
                } else {
                    ret += c;
                }
            }
            System.out.println(ret);
        }
    }
}
