package br.com.hattori.models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
	}

	public void atualiza(double taxa){
        this.saldo  += this.saldo * taxa  * 3;
    }


    public void deposita(double valor){
        this.saldo += valor - 0.1;        
    }    
}
