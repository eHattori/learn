import java.io.*;
import java.util.*;

public class TesteEscrever {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
        while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
    }
}