package br.com.hattori.collections;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;	
	
	public String getNome() {
		return nome;
	}	

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Aluno(String nome, int numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.getNome() + ", matricula: " + this.getNumeroMatricula() + " ]";
	}

}
