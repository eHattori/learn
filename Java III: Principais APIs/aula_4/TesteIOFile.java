import java.io.*;

public class TesteIOFile {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("teste.txt")));
        
        do {
            String s = br.readLine();
            System.out.println(s);

        } while(br.readLine() != null);

        br.close();

    }
}