class Empresa {

	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int pos = 0;


	void adicionar(Funcionario f){
		this.funcionarios[pos] = f;
		pos++;
	}

	void mostraEmpregados(){
		for(int i = 0; i < this.pos; i++){
			System.out.println("Funcionario na posicao: " + i);
			this.funcionarios[i].mostra();
		}
	}

	boolean contem(Funcionario f){
		 for(int i = 0; i < this.pos; i++){
                        if(this.funcionarios[i] == f){
				return true;
			} 
                }

		return false;
	}

}


class TestaEmpresa {

	
	public static void main(String[] args){
		Empresa josias = new Empresa();

		josias.funcionarios = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		f1.nome = "Joao";



		
		josias.adicionar(f1);

		josias.mostraEmpregados();
	}
}


class Data {
	int dia;
	int mes;
	int ano;


       	String getFormatada(){

		return + this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class Funcionario {

	String nome;
	String departamento;
	Data dataEntrada;
	String rg;
	float salario;
	

	public void recebeAumento(float valor){
		this.salario += valor;
	}

	float calculaGanhoAnual(){
		return (salario * 12);
	}

	void mostra(){
		System.out.println("======================================");
		System.out.println("Funcionario : " + this.nome);
		System.out.println("Salario: " + this.salario);
//		System.out.println("Data Entrada: " + this.dataEntrada.getFormatada());
		System.out.println("Salario Anual: " + this.calculaGanhoAnual());
		System.out.println("======================================");
	}

}

class Teste {

	public static void main(String[] args){

		
		Funcionario joao = new Funcionario();
		joao.nome = "Joao";
		joao.departamento = "Compras";
		joao.dataEntrada = new Data();

		joao.dataEntrada.dia = 1;
		joao.dataEntrada.mes = 1;
		joao.dataEntrada.ano = 2017;

		joao.rg = "123456789";
		joao.salario = 1000.0f;

		joao.mostra();

		joao.recebeAumento(500);

	
		joao.mostra();

	}

}

