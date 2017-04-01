package br.com.hattori.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {

		
		System.out.println("Iniciando testes de performance...");
				
		long inicioTotal = System.currentTimeMillis();
		long inicio = System.currentTimeMillis();
		
		Collection<Integer> teste = new ArrayList<Integer>();
		
		int total = 50000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		System.out.println("Tempo gasto add ArrayList: " + (System.currentTimeMillis() - inicio) + " ms");
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		System.out.println("Tempo gasto contains ArrayList: " + (System.currentTimeMillis() - inicio) + " ms");		
		
		//////////////////////////////////////////////////////////////////////////
		
		teste = new HashSet<Integer>();
		inicio = System.currentTimeMillis();
						
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		System.out.println("Tempo gasto add HashSet: " + (System.currentTimeMillis() - inicio) + " ms");
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		System.out.println("Tempo gasto contains HashSet: " + (System.currentTimeMillis() - inicio) + " ms");		
		
		
		
		
		
		System.out.println("Tempo gasto: " + (System.currentTimeMillis() - inicioTotal) + " ms");
		
		
		

	}

}
