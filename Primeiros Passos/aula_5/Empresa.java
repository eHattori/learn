class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int pos = 0;


    public void setNome(String nome){
        return this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCNpj(String cnpj){
        return this.cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setEmpregados(int qnt){
        this.funcionarios = new Funcionario[qtn];
    }

    public Funcionario getFuncionario(int posicao){
        return this.funcionarios[posicao];
    }

	void adicionar(Funcionario f){
		this.funcionarios[this.pos] = f;
		this.pos++;
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