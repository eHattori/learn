class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        this.validaData();
    }

    private void validaData(){

        //se fevereiro
        if(this.mes == 2){

            //Se o ano for bissexto
            if(this.ano % 4 == 0){
                if(this.dia >= 29){
                    System.out.println("Data inválida");
                }             
            }  if(this.dia >= 28){
                    System.out.println("Data inválida");
            }
       }
        

    }

}