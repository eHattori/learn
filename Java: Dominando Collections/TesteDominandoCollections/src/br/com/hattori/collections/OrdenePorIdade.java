package br.com.hattori.collections;

import java.util.Comparator;

public class OrdenePorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		if(o1.getIdade() > o2.getIdade()){
			return 1;
		} else if(o1.getIdade() < o2.getIdade()){
			return -1;
		} else {
			return 0;
		}
	}
}
