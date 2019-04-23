import java.util.ArrayList;

class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Func: " + nome + ":" + salario;
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    String contratar(){
        return "contratei um funcionario";
    }

    @Override
    public String toString() {
        return "Ger: " + super.toString();
    }

}


public class Controller {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("davi", 10000);
        System.out.println(gerente.getNome());
        System.out.println(gerente);
        System.out.println(gerente.contratar());

        Funcionario func = new Funcionario("rui", 100);
        System.out.println(func);

        Funcionario f2 = new Gerente("f2", 400);
        System.out.println(f2); //ligação tardia

        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(new Funcionario("ab", 12));
        funcs.add(new Gerente("cd", 15));
        funcs.add(new Funcionario("ef", 5));
        funcs.add(f2);
        funcs.add(gerente);
        funcs.add(func);

        for(Funcionario f : funcs){
            System.out.println(f);
        }
    }


}
