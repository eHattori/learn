import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import java.io.*;


public class TesteJavaScanner {

    public static void main(String[] args) throws FileNotFoundException {
        
        InputStream is = System.in;
        Scanner sc = new Scanner(is);
        

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();       

    }

}