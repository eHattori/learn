package br.com.hattori.models;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
		super(1, "CC");
	}

	public void atualiza(double taxa){
        this.saldo  += this.saldo * taxa * 2;
    }
	
}
