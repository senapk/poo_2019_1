/*
import java.util.ArrayList;

class Concreta{
    int x; //atributos
    Concreta(int x){
        this.x = x;
    }
    int calcularX(){//metodos
        return x + 3;
    }
}

abstract class Abstrata{
    int x; //atributos
    Abstrata(int x){
        this.x = x;
    }
    int calcularX(){//metodos
        return x + 3;
    }
}

abstract class Abstrata2 {
    int x; //atributos

    Abstrata2(int x) { //construtor
        this.x = x;
    }

    int calcularX() {//metodos
        return x + 3;
    }

    abstract int xMais2();  //método abstrato
}

class Concreta2 extends Concreta{
    Concreta2(int x) {
        super(x);
    }
}

class AbstrataFilha extends Abstrata{
    AbstrataFilha(int x) {
        super(x);
    }
}

class AbstrataFilha2 extends Abstrata2{

    AbstrataFilha2(int x) {
        super(x);
    }

    @Override
    int xMais2() {
        return 0;
    }
}

interface Identificavel{
    int getId();
}

class Pessoa implements Identificavel{
    int cpf;
    @Override
    public int getId() {
        return cpf;
    }
}

class Bagagem implements Identificavel{
    int localizador;
    @Override
    public int getId() {
        return localizador;
    }
}

class Funcionario{
    int id;
}

interface Autenticavel{
    String getLogin();
    boolean checkPass(String pass);
}

interface Supervisor{
    Funcionario[] getListaSupervisionados();
}

interface Comissionado{
    float getComissao();
}

class Vendedor implements Comissionado{

    @Override
    public float getComissao() {
        return 400;
    }
}

class Diretor extends Funcionario implements Supervisor,
        Comissionado{

    @Override
    public Funcionario[] getListaSupervisionados() {
        return new Funcionario[0];
    }

    @Override
    public float getComissao() {
        return 1000;
    }
}


public class Controller {
    public static void main(String[] args) {
        Concreta c1 = new Concreta(4);
        AbstrataFilha a2 = new AbstrataFilha(5);

        ArrayList<Funcionario> fs= new ArrayList<Funcionario>();
        fs.add(new Funcionario());
        fs.add(new Diretor());
        //fs.add(new Vendedor());

        ArrayList<Comissionado> cs= new ArrayList<Comissionado>();
        //cs.add(new Funcionario());
        cs.add(new Diretor());
        cs.add(new Vendedor());


        for(Funcionario f : fs)
            System.out.println(f.id);

    }
}
*/