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
		if(nome == null)
				throw new NullPointerException("Nome não pode ser nulo");
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.getNome() + ", matricula: " + this.getNumeroMatricula() + " ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroALuno = (Aluno)obj;		
		return this.getNome().equals(outroALuno.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
