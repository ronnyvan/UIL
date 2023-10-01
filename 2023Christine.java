import java.util.*;
import java.io.*;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner f = new Scanner(new File("christine.dat"));
    int ahead = f.nextInt();
    int behind;
    for(int n = 0; n < 5; n++){
      behind = ahead;
      ahead = f.nextInt();

      if(behind < ahead){
        for(int i = behind; i <= ahead; i++){
          System.out.print(i + " ");
        } 
      }
      else if(behind > ahead){
        for(int i = behind; i >= ahead; i--){
          System.out.print(i+ " ");
        }
      }
      else {System.out.print(behind);}
      System.out.println();
    }
  }
}
