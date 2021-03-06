import java.util.*;

// We have implemented Iterator Pattern in this class.
// Iterates over phoneMap and does the steps in the project description.
public class Server implements Observer {

    //Server class fits into Singleton Pattern
    //Iterator will be in this class
    private static Server server = new Server();

    private Map<String, User> phoneMap;
    private Server(){
        phoneMap = new HashMap<>();
    }

    public static Server getServer(){
        return server;
    }

    public void showMessage(){
        System.out.println("This is message from Server");
    }

    public void putToPhoneMap(String phone, User user) {
        phoneMap.put(phone, user);
        user.Attach(this);
    }

    @Override
    public void Update(Subject subject) {
        System.out.println("Received condition info update from " + subject);
    }

    public void returnList() {
        Iterator<Map.Entry<String, User>> iterator = phoneMap.entrySet().iterator();
        int count = 0;

        while (iterator.hasNext()) {
            Map.Entry<String, User> currentEntry = iterator.next();
            User currentUser = currentEntry.getValue();
            if (currentUser.getAge() >= 25 && currentUser.getAge() <= 60) {
                // First Step
                System.out.println("------------");
                System.out.println(currentUser.getName());

                // Second Step
                System.out.println("Executing queries:");
                executeQueries(currentUser);

                // Third Step
                System.out.println(currentUser.getAddress());
                System.out.println("------------");
                count++;
            }
        }
        System.out.println("\n\n------------");
        // Fourth Step
        System.out.println("Count of people: " + count);

    }

    private void executeQueries(User user) {
        Random rand = new Random();
        int randomCount = rand.nextInt(3)+1;

        QueryCommand queryCommand = new QueryCommand(user, randomCount);
        queryCommand.Execute();
    }
}