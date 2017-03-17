class Conta {

    private String nome;
    private int numero;
    private float limite;
    private float saldo;

    public Conta(int numero, float saldo, float limite){
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void saca(float valor){
        if(valor > (this.limite + this.saldo) ){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public void deposita(float valor){
        this.saldo += valor;
    }

}

class TestaConta {


    public static void main(String[] args){
        Conta conta = new Conta(1, 100.0f, 50.0f);
        System.out.println(conta.getSaldo());
    }
}
