abstract class Conta {
    void metodo1(){

    }

    private double saldo = 10;
    public int numero;
    public String nome;

    @Override
    public String toString() {    
        return "esse objeto é uma conta com saldo R$" + this.saldo;
    }

    @Override
     public boolean equals(Object obj) {
        Conta outraConta = (Conta) obj;

        return this.numero == outraConta.numero && this.nome == outraConta.nome;
     }

}

class ContaCorrente extends Conta {

}

class TesteInteger {

    public static void main(String[] args) {

        // Integer x1 = Integer.parseInt("1");
        // Integer x2 = Integer.parseInt("abc");

        // System.out.println(x1);        
        // System.out.println(x2);

        Conta c1 = new ContaCorrente();
        c1.numero = 10;
        c1.nome = "jao";

        Conta c2 = new ContaCorrente();
        c2.numero = 10;
        c1.nome = "marcos";

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));


        String teste = "abcdefg";

        for(int i = teste.length() - 1; i >= 0; i--){
               System.out.println(teste.charAt((i))); 
        }        

        String msg = "Socorram-me, subi no ônibus em Marrocos";

        String[] aMsg = msg.split(" ");
        String novaString = "";

        for(int i = aMsg.length - 1; i >= 0; i--){
            novaString += aMsg[i] + " ";
        }

        System.out.println(novaString);


        StringBuilder invertido = new StringBuilder(msg).reverse();
        System.out.println(invertido);


        String x = "123";
        int a = Integer.parseInt(x);
        System.out.println(a);
    }
}