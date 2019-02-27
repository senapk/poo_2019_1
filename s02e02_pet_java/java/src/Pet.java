import java.util.Scanner;

public class Pet {
    String name;
    int energy;
    int hungry;
    int clean;
    int energyMax;
    int hungryMax;
    int cleanMax;

    public Pet(String name, int energy, int hungry, int clean){
        this.name = name;
        this.energy = energy;
        this.hungry = hungry;
        this.clean = clean;
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = clean;
    }

    public String toString() {
        return  "[" + this.name + "] " +
                "E: " + this.energy + "/" + this.energyMax + " " +
                "S: " + this.hungry + "/" + this.hungryMax + " " +
                "L: " + this.clean + "/" + this.cleanMax;
    }
}

class Controller{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet pet = new Pet("", 0, 0, 0);
        System.out.println("end, init _nome _E _S _L, show");
        while(true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]),
                                     Integer.parseInt(ui[3]),
                                     Integer.parseInt(ui[4]));
            }else if(ui[0].equals("show")){
                System.out.println(pet);
            }else{
                System.out.println("fail: comando invalido");
            }
        }
    }
}














