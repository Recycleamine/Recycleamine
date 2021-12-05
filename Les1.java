
package les1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class Les1 {

    public static void main(String[] args) throws IOException {
      System.out.println("RECYCLE***WORDLIST***GENERETARE");
      Scanner s = new Scanner(System.in);
      System.out.print("Pleas Inter Chars and passlenght :");
      String [] input ;
      input = s.nextLine().split(" ");
      char [] alpha = input[0].toCharArray();
      int passlength = Integer.parseInt(input[1]);
      String filename = input[2];
      StringBuilder st = new StringBuilder();
      st.setLength(passlength);
      int count = (int)(Math.pow(passlength, alpha.length));
      System.out.println("*****AMINE***********"+ count +"********RECYCLE***********");
      test(st,0,alpha,filename);
      System.out.println("*****AMINE*********** end ********RECYCLE***********");
      StringBuilder amine ;
      
      
}
   
   
    public static void test (StringBuilder sb ,int n,char[] s,String filename) throws IOException{
        
        
        
        if (n == sb.length()){
            System.out.println(sb.toString());
            StringBuilder ss = new StringBuilder();
            ArrayList<String> list = new ArrayList<>();
            ss.append(sb.toString());
            FileWriter o = new FileWriter(filename,true);
            o.append(ss.toString()+"\r\n");
            o.close();
            return;
            
        }
              
        for (char c : s){
            sb.setCharAt(n, c);
            test(sb,n+1,s,filename);
           
        }
        
    }
       
    }
    
    
