import java.util.*;
import java.io.*;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner f = new Scanner(new File("miguel.dat"));
    int n = f.nextInt();
    f.nextLine();
    while(n-- > 0){
      String s = f.nextLine();
      ArrayList<Character> chars = new ArrayList<>();

      for(int i = 0; i < s.length(); i++){
        char currentCharacter = s.charAt(i);
        if(Character.isAlphabetic(currentCharacter)) chars.add(currentCharacter);
      }

      Collections.sort(chars, 
      (c1, c2) -> Integer.compare(Character.toLowerCase(c1), Character.toLowerCase(c2)));

      String ret = "";
      for(int i = 0, j = 0; i < s.length(); i++){
        char currentCharacter = s.charAt(i);
        if(Character.isAlphabetic(currentCharacter)) {
          if(Character.isUpperCase(currentCharacter)) ret += Character.toUpperCase(chars.get(j++));
          else ret += Character.toLowerCase(chars.get(j++));
        }
        else ret += currentCharacter;
      }
      System.out.println(ret);
    }
  }
}
