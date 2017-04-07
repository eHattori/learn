package br.com.hattori.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {	

	private String autor;
	private String nome;
	private List<Aula> aulas;
	private Set<Aluno> alunos;
	private int tempoTotal;

	public Curso(String nome, String autor){
		this.nome = nome;
		this.autor = autor;
		this.aulas = new ArrayList<>();
		this.alunos = new HashSet<>();
	}	
	
	public String getAutor() {
		return autor;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void adiciona(Aula aula){
		this.aulas.add(aula);
	}

	public List<Aula> getAulas() {
		return  Collections.unmodifiableList(this.aulas);
	}	
	
	public int getTempoTotal() {		
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}	
	
	@Override
	public String toString() {		
		return "[Curso: " + this.nome + ", tempo-total: " + this.tempoTotal + " aulas : [" + aulas.toString() + "]" ;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(this.alunos);
	}
	
}
