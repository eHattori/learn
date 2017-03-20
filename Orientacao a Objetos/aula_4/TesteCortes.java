abstract class Conta {

    protected double saldo;

    abstract void atualiza();

    public double getSaldo(){
        this.atualiza();
        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){                    
            this.saldo -= valor;
        
    }
}

interface Teste { 
    public void teste();
}

class TestaContas {
    public static void main(String[] args) {

        Conta conta = new Conta(){
            @Override
            void atualiza(){
                System.out.println("asasd");
            }
        };
        conta.deposita(0.1);

        Teste t = new Teste(){
            @Override
            public void teste(){
                System.out.println("asasd");
            }
        };

        
    }
}