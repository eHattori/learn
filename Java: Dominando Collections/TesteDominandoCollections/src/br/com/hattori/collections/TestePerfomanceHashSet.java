package br.com.hattori.collections;

import java.util.HashSet;
import java.util.Set;

public class TestePerfomanceHashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo gasto: " + (fim - inicio));
		
	}
}
