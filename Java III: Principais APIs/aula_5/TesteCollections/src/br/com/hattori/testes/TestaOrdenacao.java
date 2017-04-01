package br.com.hattori.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.hattori.models.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<ContaPoupanca> lista = new ArrayList<>();
		
		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Joao" );
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		lista.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Maria" );
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		lista.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Adamastor" );
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		lista.add(c3);
			
		Collections.sort( lista);
		System.out.println(lista);

	}

}
