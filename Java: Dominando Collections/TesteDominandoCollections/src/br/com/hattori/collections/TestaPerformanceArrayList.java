package br.com.hattori.collections;

import java.util.ArrayList;
import java.util.List;

public class TestaPerformanceArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
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
