import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
    	Server server = Server.getServer();

        for (int i = 0; i < 80 ; i++) {
            Client client = new Client(i % 2 == 0 ? new Samsung() : new Iphone());
            Adapter adapter = new Adapter(client.getPhone());

            String userPhoneNumber = (String) adapter.send(String.join("", Collections.nCopies(3, String.valueOf(i))));
            User user = new User("Yaðýzcan Arslan", i, "Güzelyalý");

            User newUser = (User) adapter.send(user);
            newUser.Attach(server);

            server.putToPhoneMap(userPhoneNumber, newUser);

            user.putToConditionMap(i % 2 == 0 ? "fever" : "runny nose", i % 2 == 0 ? "Konak" : "Güzelyalý");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "runny nose", i % 2 == 0 ? "Güzelyalý" : "Narlýdere");
            user.putToConditionMap(i % 2 == 0 ? "runny nose" : "runny nose", i % 2 == 0 ? "Özdere" : "Alsancak");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "fever", i % 2 == 0 ? "Özdere" : "Güzelyalý");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "fever", i % 2 == 0 ? "Özdere" : "Narlýdere");
        }

        /*Client client2 = new Client(new Iphone());
        adapter = new Adapter(client2.getPhone());
        userPhoneNumber = (String) adapter.send("5355433370");
        user = new User("Berkin Yýldýran", 27, "Narlýdere");
        newUser = (User) adapter.send(user);
        newUser.Attach(server);
        server.putToPhoneMap(userPhoneNumber, newUser);
        user.putToConditionMap("runny nose", "Güzelyalý");
        user.putToConditionMap("runny nose", "Güzelyalý");
        user.putToConditionMap("fever", "Balçova");
        user.putToConditionMap("fever", "Balçova");
        user.putToConditionMap("fever", "Güzelyalý");*/

        server.returnList();
    }
}