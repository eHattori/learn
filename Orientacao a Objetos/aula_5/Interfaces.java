interface Area {
    public double calcula();
}


class Circulo implements Area {

    public Circulo(double raio){
        this.raio = raio;
    }

    double raio;

    @Override public double calcula(){
        return  2 * 3.14 * this.raio;
    }
}


class TestaInterface {
    public static void main(String[] args) {
        Area circulo = new Circulo(2);

        System.out.printf("A área é: %.2f", circulo.calcula());
    }
}