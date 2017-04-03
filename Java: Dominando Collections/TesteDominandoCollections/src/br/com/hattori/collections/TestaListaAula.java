package br.com.hattori.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaAula {

	public static void main(String[] args) {
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		Aula a1 = new Aula("Super Aula 1", 20);
		Aula a2 = new Aula("Aula 2", 15);
		Aula a3 = new Aula("Aula 3", 10);
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		aulas.sort(java.util.Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);

	}

}
