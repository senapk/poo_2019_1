import java.util.ArrayList;
import java.util.Scanner;

class User{
    String id;
    String pass;
    public User(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }
    public String showAll(){
        return id + ":" + pass;
    }

    public String toString(){
        return id;
    }
}

class Service{
    ArrayList<User> users;
    User userCurrent;
    public Service(){
        userCurrent = null;
        users = new ArrayList<User>();
        users.add(new User("admin", "admin"));
    }

    User findUser(String id){
        for(User user : users) {
            if (user.id.equals(id))
                return user;
        }
        return null;
    }

    void addUser(String id, String pass){
        if(findUser(id) != null)
            throw new RuntimeException("fail: ja existe alguem logado");
        users.add(new User(id, pass));
    }
    public String toString(){
        String saida = "[ ";
        for(User user : users){
            saida += user.id + " ";
        }
        return saida + "]";
    }

    User getUserCurrent(){
        if(userCurrent == null)
            throw new RuntimeException("fail: nao existe ninguem logado");
        return userCurrent;
    }

    void login(String id, String pass){
        if(this.userCurrent != null){
            System.out.println("fail: ja existe alguem logado");
            return;
        }
        User user = findUser(id);
        if(user == null){
            System.out.println("fail: usuario nao existe");
            return;
        }
        if(!user.pass.equals(pass)){
            System.out.println("fail: senha invalida");
            return;
        }
        this.userCurrent = user;
    }

    void logout(){
        User user = getUserCurrent();
        userCurrent = null;
    }

    void showPass(){
        System.out.println(getUserCurrent().showAll());
    }
}


class GerLogin{
    User currentUser;

    void login(String id, String pass);
    void logout();
    User getCurrent();
}


public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);


        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            try {
                if (ui[0].equals("end")) {
                    break;
                } else if (ui[0].equals("init")) {
                    service = new Service();
                } else if (ui[0].equals("adduser")) {
                    service.addUser(ui[1], ui[2]);
                } else if (ui[0].equals("showusers")) {
                    System.out.println(service);
                } else if (ui[0].equals("login")) {
                    service.login(ui[1], ui[2]);
                } else if (ui[0].equals("logout")) {
                    service.logout();
                } else if (ui[0].equals("showpass")) {
                    service.showPass();
                } else {
                    System.out.println("fail: invalid command");
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

    }
}








