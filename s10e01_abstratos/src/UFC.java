


abstract class Funcionario{
    String nome;
    abstract double calcSalario();
    public Funcionario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Professor extends Funcionario{
    char classe;
    Professor(String nome, char classe){
        super(nome);
        this.classe = classe;
    }

    @Override
    double calcSalario() {
        String nome = "Fulano";
        String letraInicial = "F";
        for(int i = 0; i < nome.length(); i++){
            char c = nome.charAt(i);
            System.out.print(c + " ");
        }

        return (classe - 'A') * 2000 + 3000;
    }

    @Override
    public String toString() {
        return super.toString() + "classe: " + this.classe;
    }
}

public class UFC {
    public static void main(String[] args) {
        Funcionario david = new Professor("David", 'D');
        System.out.println(david);
        System.out.println(david.calcSalario());
    }


}
