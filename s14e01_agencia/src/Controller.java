import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


abstract class Conta{
    int id;
    double saldo;
    String clienteId;
    protected String tipo;
    public Conta(int id, String clienteId){
        this.id = id;
        this.clienteId = clienteId;
        this.saldo = 0;
        this.tipo = "";
    }
    public String toString(){
        return "" + id + ":" + clienteId + ":" + saldo + ":" + tipo;
    }
}

class ContaCorrente extends Conta{
    public ContaCorrente(int id, String clienteId) {
        super(id, clienteId);
        this.tipo = "CC";
    }
}

class ContaPoupanca extends Conta{
    public ContaPoupanca(int id, String clienteId) {
        super(id, clienteId);
        this.tipo = "CP";
    }
}

class Cliente{
    String id;
    ArrayList<Conta> contas;

    public Cliente(String id){
        this.id = id;
        contas = new ArrayList<Conta>();
    }
    void addConta(Conta conta){ //agregacao
        contas.add(conta);
    }

    public String toString(){
        return id;
    }

}

class Agencia{
    Map<String, Cliente> clientes;
    Map<Integer, Conta> contas;
    int nextId;
    public Agencia(){
        clientes = new TreeMap<String, Cliente>();
        contas = new TreeMap<Integer, Conta>();
        int nextId = 0;
    }
    public void addCliente(String id){
        if(clientes.get(id) == null) {
            Conta poupanca = new ContaPoupanca(nextId++, id);
            Conta corrente = new ContaCorrente(nextId++, id);
            Cliente cliente = new Cliente(id);
            cliente.addConta(poupanca);
            cliente.addConta(corrente);

            clientes.put(id, cliente);
            contas.put(poupanca.id, poupanca);
            contas.put(corrente.id, corrente);
        }
    }
    public String toString(){
        String saida = "";
        for(Conta conta: contas.values())
            saida += conta + "\n";
        return saida;
    }
}

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end"))
                break;
            else if(ui[0].equals("addCli")){
                agencia.addCliente(ui[1]);
            }else if(ui[0].equals("show")){
                System.out.println(agencia);
            }
        }
    }
}
