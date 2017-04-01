package br.com.hattori.models;

public class Conta  implements Comparable<Conta>{

	protected double saldo;
	protected int numero;
	protected String nome;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public Conta(int numero, String nome){
		this.numero = numero;
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;

	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		
		return  "Olá "+ this.getNome() + " Seu saldo é de " + this.getSaldo() + " e seu numero é " + this.getNumero();
	}

	@Override
	public int compareTo(Conta o) {		
		return this.getNome().compareTo(o.getNome());
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
