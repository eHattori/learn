package br.com.hattori.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {	

	private String autor;
	private String nome;
	private List<Aula> aulas;
	private int tempoTotal;

	public Curso(String nome, String autor){
		this.nome = nome;
		this.autor = autor;
		this.aulas = new ArrayList<>();
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
	
}
