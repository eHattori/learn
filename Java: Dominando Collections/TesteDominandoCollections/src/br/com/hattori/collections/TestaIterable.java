package br.com.hattori.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaIterable {
	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
				
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		
		Iterator<String> iterador = letras.iterator();
		
		while(iterador.hasNext()){
			String letra = iterador.next();			
			System.out.println(letra);
		}
	}
}
