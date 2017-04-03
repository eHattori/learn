package br.com.hattori.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Curso 1");
		lista.add("Curso 2");
		lista.add("Curso 3");
		lista.add("Alo 123");
		
		lista.remove(0);
		
		System.out.println(lista);
		
		System.out.println("O primeiro curso da lista eh o: " + lista.get(0)); // como acessar o primeiro valor?
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
