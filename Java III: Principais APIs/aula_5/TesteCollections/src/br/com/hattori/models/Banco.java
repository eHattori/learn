package br.com.hattori.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> nomes = new HashMap<String, Conta>();
	
	public void adiciona(Conta conta){
		this.nomes.put(conta.getNome(), conta);
		this.contas.add(conta);
	}
	
	public Conta pega(int x){
		return this.contas.get(x);
	}
	
	public int pegaQuantidadeContas(){
		return this.contas.size();
	}
	
	public Conta buscaContaPorNome(String nome){
		return this.nomes.get(nome);
	}
}
