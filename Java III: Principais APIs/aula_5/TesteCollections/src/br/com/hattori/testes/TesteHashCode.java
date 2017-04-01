package br.com.hattori.testes;

import java.util.HashSet;

import br.com.hattori.models.Conta;

public class TesteHashCode {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, "Eduardo");
		Conta c2 = new Conta(1, "João");
				
		HashSet<Conta> contas = new HashSet<Conta>();
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
		
	}

}
