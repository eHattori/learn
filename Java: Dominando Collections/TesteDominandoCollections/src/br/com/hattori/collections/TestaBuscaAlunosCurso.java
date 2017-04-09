package br.com.hattori.collections;

public class TestaBuscaAlunosCurso {
	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Turini", 123);
		Aluno a2 = new Aluno("Maria", 456);
		Aluno a3 = new Aluno("Alice", 789);		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o Aluno com a matricula 456?");
		
		Aluno aluno = javaColecoes.buscaMatriculado(456);
		System.out.println(aluno);
		
		javaColecoes.getMatriculaPorAluno().keySet().forEach(matricula -> {
			System.out.println(matricula);
		});
		
	}
}
