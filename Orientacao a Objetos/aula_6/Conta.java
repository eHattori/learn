class Conta {
    protected double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){

        if(valor < 0){
            throw new ValorInvalidoException(valor);
        }
        this.saldo += valor;
    }

    public void saca(double valor){        
            this.saldo -= valor;
        
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}


class ContaCorrente extends Conta {

    public void atualiza(double taxa){
        this.saldo  += this.saldo * taxa * 2;
    }

}


class ContaPoupanca extends Conta {

    public void atualiza(double taxa){
        this.saldo  += this.saldo * taxa  * 3;
    }


    public void deposita(double valor){
        this.saldo += valor - 0.1;        
    }
}

class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }

    public void roda(Conta c){
        System.out.println("Saldo atual : " + c.getSaldo());
        c.atualiza(this.selic);        
        System.err.println("Saldo com selic : " + c.getSaldo());
        this.saldoTotal += c.getSaldo();        
    }
}

class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(-10); 
        cc.deposita(1000); 
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total : " + adc.getSaldoTotal());
    }
}

class TestaDeposita {
    public static void main(String[] args) {        
        Conta cp = new ContaCorrente();
        try {
            cp.deposita(-100);
        } catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }        
    }
}

class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException(double valor){
        super("Valor invalido: " + valor);
    }
}