import java.io.*;

public class TesteJavaIO {
    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Digite uma mensagem");

        do {
            String s = br.readLine();
            System.out.println(s);

        } while(br.readLine() != null);

        br.close();
    }

}