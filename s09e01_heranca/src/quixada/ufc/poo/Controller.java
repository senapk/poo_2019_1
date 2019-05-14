package quixada.ufc.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Funcionario {
    private String nome;
    protected double salario;
    protected char title;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.title = 'F';
    }

    public String getNome(){
        return nome;
    }

    public double getBonificacao() {
        return salario * 0.10;
    }

    double getSalario(){
        return salario + getBonificacao();
    }

    @Override
    public String toString() {
        return title + ":" + nome + ":" + salario;
    }
}

class Gerente extends Funcionario {
    String pass;
    public Gerente(String nome, double salario, String pass) {
        super(nome, salario);
        this.pass = pass;
        this.title = 'G';
    }

    String contratar(){
        return "contratei um funcionario";
    }

    public double getBonificacao() {
        return this.salario * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + this.pass;
    }

}


class Diretor extends Gerente{
    double FG;
    public Diretor(String nome, double salario, double FG) {
        super(nome, salario, nome);
        this.FG = FG;
        this.title = 'D';
    }

    public double getBonificacao() {
        return super.getBonificacao() * 2;
    }

    @Override
    double getSalario() {
        return super.getSalario() + FG;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + FG;
    }
}

class Empresa{
    ArrayList<Funcionario> funcionarios;
    public Empresa(){
        funcionarios = new ArrayList<Funcionario>();
    }
    public void addFuncionario(Funcionario func){
        funcionarios.add(func);
    }

    public double calcularFolha(){
        double folha = 0.0;
        for(Funcionario func : funcionarios)
            folha += func.getSalario();
        return folha;
    }

    @Override
    public String toString() {
        String saida = "";
        for(Funcionario func : funcionarios)
            saida += func + "\n";
        return saida;
    }
}


public class Controller {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("addF")){//addF _nome _salario
                emp.addFuncionario(new Funcionario(ui[1], Double.parseDouble(ui[2])));
            }else if(ui[0].equals("addG")){//addG _nome _salario _senha
                emp.addFuncionario(new Gerente(ui[1], Double.parseDouble(ui[2]), ui[3]));
            }else if(ui[0].equals("addD")){//addG _nome _salario _FG
                emp.addFuncionario(new Diretor(ui[1], Double.parseDouble(ui[2]), Double.parseDouble(ui[3])));
            }else if(ui[0].equals("show")){
                System.out.println(emp);
            }else if(ui[0].equals("folha")){
                System.out.println(emp.calcularFolha());
            }
        }




        /*
        Diretor Lorena = new Diretor("Lorena", 12000, 5000);

        Gerente gerente = new Gerente("davi", 10000, "DAVI");
        System.out.println(gerente.getNome());
        System.out.println(gerente);
        System.out.println(gerente.contratar());

        Funcionario func = new Funcionario("rui", 100);
        System.out.println(func);

        Funcionario f2 = new Gerente("f2", 400, "F2");
        System.out.println(f2); //ligação tardia

        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(new Funcionario("ab", 12));
        funcs.add(new Gerente("cd", 15, "CD"));
        funcs.add(new Funcionario("ef", 5));
        funcs.add(f2);
        funcs.add(gerente);
        funcs.add(func);

        for(Funcionario f : funcs){
            System.out.println(f);
        }
        */
    }
}
/*
$addF davi 400
$show
F:davi:400
$addG lucas 800 Lucas
$show
F:davi:400
G:lucas:800:Lucas
$addD kessia 15000 7000
$show
F:davi:400
G:lucas:800:Lucas
D:kessia:15000:kessia:7000
$folha


 */














