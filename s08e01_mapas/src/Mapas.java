import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;


class Pessoa{
    String id;
    int idade;

    public Pessoa(String id, int idade) {
        this.id = id;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return id + ":" + idade;
    }
}

class Banco{
    TreeMap<String, Pessoa> pessoas;
    public Banco() {
        pessoas = new TreeMap<String, Pessoa>();
    }

    void inserir(String id, int idade) {
        Pessoa pessoa = pessoas.get(id);
        if(pessoa == null){
            pessoas.put(id, new Pessoa(id, idade));
        }
    }

    public String toString(){
        String saida = "";
        for(String key : pessoas.keySet())
            saida += pessoas.get(key) + "\n";
        return saida;
    }

}


public class Mapas {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.inserir("davi", 18);
        banco.inserir("davi", 19);
        banco.inserir("sintia", 23);
        banco.inserir("lucas", 27);
        banco.inserir("ana", 3);
        System.out.println(banco);
    }

    public static void main2(String[] args) {

        ArrayList<Integer> lista;
        Banco banco = new Banco();
        banco.inserir("davi", 18);
        System.out.println(banco);

        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        mapa.put("david", 18);
        mapa.put("vanessa", 40);
        mapa.put("tailandia", 17);
        mapa.put("romenia", 15);

        mapa.remove("tailandia");
        Integer in = mapa.get("vassoura");
        if(in == null)
            System.out.println("nao tenho vassoura");

        for(String key : mapa.keySet())
            System.out.println(mapa.get(key));
    }


}
