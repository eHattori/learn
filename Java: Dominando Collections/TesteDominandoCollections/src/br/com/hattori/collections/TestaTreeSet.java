package br.com.hattori.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Joao", 30);
		Funcionario f2 = new Funcionario("Maria", 25);
		Funcionario f3 = new Funcionario("Samuel", 21);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenePorIdade());
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while(iterador.hasNext()){
			System.out.println(iterador.next().getNome());
		}
		
	}
}
