//recursive implementation
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("patrick.dat"));
        while (f.hasNextLine()) {
            int N = f.nextInt();
            int P = f.nextInt();
            f.nextLine();
            String result = String.valueOf(N);

            for(int i = 0; i < P-1; i++){
                result = convert(result);
            }
            
            System.out.println(result);
        }

    }
    static String convert(String s){
        String ret = "";
        int count = 1;
        char curr = s.charAt(0);
    
        for(int j = 1; j < s.length(); j++){
            char next = s.charAt(j);
            if(curr == next) count++;
            else {
                ret += count + "" + curr;
                return ret + convert(s.substring(j));
            }
        }

        //if the string ends with repeating characters
        ret += count + "" + curr;
        return ret;
    }
}

//iterative implementation
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("patrick.dat"));
        while(f.hasNextLine()){
            int N = f.nextInt();
            int P = f.nextInt();
            f.nextLine();
            String result = String.valueOf(N);
            
            for (int i = 0; i < P - 1; i++) {
                result = convert(result);
            }
            System.out.println(result);
        }
    }

    static String convert(String s){
        String ret = "";
        for(int i = 0; i < s.length(); i++){
            int count = 1;
            char curr = s.charAt(i);

            for(int j = i + 1; j < s.length(); j++){
                char next = s.charAt(j);
                if(curr == next){
                    count++;
                } else {break;}
            }

            ret += count + "" + curr;
            i += count - 1;
        }
        return ret;
    }
}
