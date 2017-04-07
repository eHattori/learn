package br.com.hattori.collections;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcento {
	
	public static void main(String[] args) {
				
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Leonidas");
		alunos.add("Eduardo");		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		
		alunos.add("Eduardo");
		
		System.out.println(alunos.size());
	}

}
