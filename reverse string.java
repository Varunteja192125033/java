import java.io.*;
import java.util.Scanner;
  
class Reversestr {
    public static void main (String[] args) {
        
        String str= "TEMPLE", nstr="";
        char ch;
        
      System.out.print("String: ");
      System.out.println("TEMPLE");
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println("Reversed word: "+ nstr);
    }
}