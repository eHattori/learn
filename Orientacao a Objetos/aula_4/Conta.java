abstract class Conta {
    protected double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){        
            this.atualiza(0.1);
            this.saldo -= valor;
        
    }

    public abstract void atualiza(double taxa);
}


class ContaCorrente extends Conta {

    public void atualiza(double taxa){
        this.saldo  += this.saldo * taxa * 2;
    }

}


class ContaPoupanca extends Conta {

    @Override public void atualiza(double taxa){
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
        Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000); 
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