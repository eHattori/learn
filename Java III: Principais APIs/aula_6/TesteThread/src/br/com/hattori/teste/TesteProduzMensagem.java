package br.com.hattori.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TesteProduzMensagem {
	public static void main(String[] args) {
		
		Vector<String> mensagens = new Vector<>();
		
		Thread t1 = new Thread(new ProduzMensagem(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagem(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagem(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Threads produtoras de mensdagens finalizadas");
		
		for (int i = 0; i < 30000; i++) {
			if(!mensagens.contains("Mensagem " + i)){
				throw new IllegalStateException("Não encontramos a mensagem " + i);
			}			
		}
		
		if(mensagens.contains(null)){
			throw new IllegalStateException("Tem nullo dentro das mensagens");
		}		
		
		System.out.println("Executado com sucesso");
	}
}
