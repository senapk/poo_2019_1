import java.util.ArrayList;
import java.util.Scanner;

class Espiral{
    String name;
    double price;
    int qtd;
    public Espiral(String name, double price, int qtd){
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }
    public String toString(){
        return "[" + this.name + " : " + this.qtd + "U : " + this.price + "]";
    }
}

class Machine{
    ArrayList<Espiral> espirais;
    double saldo;
    int maxProdutos;
    public Machine(int nEspirais, int maxProdutos){
        espirais = new ArrayList<Espiral>();
        for(int i = 0; i < nEspirais; i++)
            espirais.add(new Espiral("Empty", 0, 0));
        this.maxProdutos = maxProdutos;
    }
    public String toString(){
        String saida = "";
        for(int i = 0; i < espirais.size(); i++){
            saida += i + " " + espirais.get(i) + "\n";
        }
        return saida;
    }
    void comprar(int ind){
        verifica se indice existe;
        verificar se ha produtos;
        verificar se ha saldo;
        diminuir qtd da espiral em 1;
        diminuir saldo em valor da espiral;
    }

    setEspiral(indice, nome, preco, qtd){
        verificar se indice existe;
        substituir valore
    }
    /*
    setEspiral(ind, name_produto, preco, qtd);
    resetEspiral(ind);
    inserirDin(float din);
    pedirTroco();
    comprar(indice_produto);
     */
}







public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine maq = new Machine(0, 0);
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                maq = new Machine(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("show")){
                System.out.println(maq);
            }
        }
    }
}
