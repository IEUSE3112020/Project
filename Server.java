import java.util.ArrayList;
import java.util.List;

public class Server implements Observer {

    //Server class fits into Singleton Pattern
    //Iterator will be in this class
    private static Server server = new Server();

    // TODO
    // userList or phoneList???
    private List<User> userList;

    private Server(){
        userList = new ArrayList<>();
    }

    public static Server getServer(){
        return server;
    }

    public void showMessage(){
        System.out.println("This is message from Server");
    }

    @Override
    public void Update(Subject subject) {
        System.out.println("Received condition info update from " + subject);
    }

    public List<User> getTheList() {
        return userList;
    }
}