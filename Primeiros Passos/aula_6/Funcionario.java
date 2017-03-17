class Funcionario {

    private String nome;
    private static int id = 1;

    public getId(){
        return this.id;
    }
    
    public Funcionario(String nome){
        this.nome = nome;
        this.id++;
    }

    public Funcionario(){
        this.id++;
    }
}