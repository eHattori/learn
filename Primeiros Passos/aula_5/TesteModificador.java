class Funcionario {

    private String nome;
    private float salario;

    public void setSalario(float novoSalario){
        this.salario = novoSalario;
    }

    public float getSalario(){
        return this.salario;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }



    public void mostra(){
        System.out.println("Funcionario : " + this.getNome());
        System.out.println("Salario : " + this.getSalario());
    }
}

class TestaModificador {

    public static void main (String[] args){

        Funcionario f1 = new Funcionario();
        f1.setNome("joao");

        f1.setSalario(1000.0f);

        f1.mostra();
    }
}
