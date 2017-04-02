package br.com.hattori.teste;

import java.util.Collection;
import java.util.Vector;

public class ProduzMensagem implements Runnable {

	private int comeco;
	private int fim;
	private Vector<String> mensagens;
	
	public ProduzMensagem(int comeco, int fim, Vector<String>mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}
	
	@Override
	public void run() {
		for(int i = this.comeco; i < fim; i++){
//			synchronized (mensagens) {
				mensagens.add("Mensagem " + i);
//			}			
		}
	}

	public Vector<String> getMensagens() {
		return mensagens;
	}

	public void setMensagens(Vector<String> mensagens) {
		this.mensagens = mensagens;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public int getComeco() {
		return comeco;
	}

	public void setComeco(int comeco) {
		this.comeco = comeco;
	}
}
