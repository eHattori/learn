package br.com.hattori.testes;

import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		for (int i = 0; i < 1000; i++) {
			numeros.add(i);
		}
		
		for(Integer i : numeros.descendingSet()){
			System.out.println(i);
		}
		
		
	}
}
