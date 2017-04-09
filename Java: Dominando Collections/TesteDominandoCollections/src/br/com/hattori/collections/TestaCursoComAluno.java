package br.com.hattori.collections;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " esta matriculado");		
		System.out.println(javaColecoes.estaMtriculado(a1));
		
		Aluno turini = new Aluno("Turini", 123);
		System.out.println("O Turini esta matriculado?");
		System.out.println(javaColecoes.estaMtriculado(turini));
		
		System.out.println("O turini compado com o a1 com equals");
		
		System.out.println(a1.equals(turini));

	}
}
