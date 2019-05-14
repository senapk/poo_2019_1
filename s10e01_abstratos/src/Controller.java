import java.util.ArrayList;
/*
comecar o projeto calculo de salario
1. criar classe abstrata Funcionario
    nome e metodo abstrato
2. criar classe professor
    implementar o calcular salario
    implementar o toString
3. Criar um vetor de Funcionarios na main
    adicionar professores
    mostrar
*/

abstract class Veiculo { //abstrata
    int ano;          //atributos
    private String placa;
    float tanque;
    int capacidade;
    public Veiculo(String placa){
        this.placa = placa;
    }
    void setPlaca(String placa){ //metodos concretos
        this.placa = placa;
    }
    String getPlaca() { //métodos concretos
        return placa;
    }
    double gerarMulta(){
        return 100;
    }
    abstract float calcularDPVAT(); //metodos abstratos
}

class Carro extends Veiculo{ //concreta
    public Carro(String placa){
        super(placa);
    }
    float calcularDPVAT(){ //sobrescrita de metodo
        return 1000;
    }
    double gerarMulta(){ //sobrescrita de metodo
        return 1.5 * super.gerarMulta();
    }

}

abstract class Moto extends Veiculo{
    public Moto(String placa){
        super(placa);
    }
}

class MotoCorrida extends Moto{
    public MotoCorrida(){
        super("");
    }
    @Override
    float calcularDPVAT() {
        return 0;
    }
}


public class Controller {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("oie"));
        veiculos.add(new MotoCorrida());
    }

}
