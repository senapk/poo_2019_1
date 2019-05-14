import java.util.ArrayList;


interface Pass{
    String getId();
}

class Person implements Pass{
    String nome;

    public Person(String nome) {
        this.nome = nome;
    }

    @Override
    public String getId() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Carga implements Pass{
    String localizador;
    int volume;

    public Carga(String localizador, int volume) {
        this.localizador = localizador;
        this.volume = volume;
    }

    @Override
    public String getId() {
        return localizador;
    }

    @Override
    public String toString() {
        return localizador + ":" + volume;
    }
}

interface Vagao {
    boolean embarcar(Pass pass);
    //Pass desembarcar(String id);
    //boolean exists(String id);
}

class VagaoPessoas implements Vagao {
    ArrayList<Pass> passageiros;

    public VagaoPessoas() {
        this.passageiros = new ArrayList<Pass>();
    }

    @Override
    public boolean embarcar(Pass pass) {
        if(pass instanceof Person) {
            passageiros.add(pass);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String saida = "[ ";
        for(Pass pass : passageiros)
            saida += pass + " ";
        return saida + "]";
    }
}

class VagaoCarga implements Vagao {
    ArrayList<Pass> passageiros;

    public VagaoCarga() {
        this.passageiros = new ArrayList<Pass>();
    }

    @Override
    public boolean embarcar(Pass pass) {
        if(pass instanceof Carga) {
            passageiros.add(pass);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String saida = "[ ";
        for(Pass pass : passageiros)
            saida += pass + " ";
        return saida + "]";
    }
}

class Trem {
    ArrayList<Vagao> vagoes;

    public Trem() {
        this.vagoes =  new ArrayList<Vagao>();
    }

    public void addVagao(Vagao v) {
        vagoes.add(v);
    }

    public boolean embarcar(Pass pass) {
        for (Vagao v : vagoes) {
            if (v.embarcar(pass)) {
                return true;
            }
        }
        return false;
    }

    @Override

    public String toString() {
        String saida = "{ ";
        for(Vagao vag : vagoes)
            saida += vag + " ";
        return saida + "}";
    }
}



public class Controller {
    public static void main(String[] args) {
        Trem trem = new Trem();
        trem.addVagao(new VagaoCarga());
        trem.addVagao(new VagaoPessoas());
        trem.embarcar(new Person("jose"));
        trem.embarcar(new Person("maria"));
        trem.embarcar(new Carga("xilito", 500));

        System.out.println(trem);

    }

}
