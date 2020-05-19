import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
    	Server server = Server.getServer();

        for (int i = 0; i < 80 ; i++) {
            Client client = new Client(i % 2 == 0 ? new Samsung() : new Iphone());
            Adapter adapter = new Adapter(client.getPhone());

            String userPhoneNumber = (String) adapter.send(String.join("", Collections.nCopies(3, String.valueOf(i))));
            User user = new User("Ya��zcan Arslan", i, "G�zelyal�");

            User newUser = (User) adapter.send(user);
            newUser.Attach(server);

            server.putToPhoneMap(userPhoneNumber, newUser);

            user.putToConditionMap(i % 2 == 0 ? "fever" : "runny nose", i % 2 == 0 ? "Konak" : "G�zelyal�");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "runny nose", i % 2 == 0 ? "G�zelyal�" : "Narl�dere");
            user.putToConditionMap(i % 2 == 0 ? "runny nose" : "runny nose", i % 2 == 0 ? "�zdere" : "Alsancak");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "fever", i % 2 == 0 ? "�zdere" : "G�zelyal�");
            user.putToConditionMap(i % 2 == 0 ? "normal" : "fever", i % 2 == 0 ? "�zdere" : "Narl�dere");
        }

        /*Client client2 = new Client(new Iphone());
        adapter = new Adapter(client2.getPhone());
        userPhoneNumber = (String) adapter.send("5355433370");
        user = new User("Berkin Y�ld�ran", 27, "Narl�dere");
        newUser = (User) adapter.send(user);
        newUser.Attach(server);
        server.putToPhoneMap(userPhoneNumber, newUser);
        user.putToConditionMap("runny nose", "G�zelyal�");
        user.putToConditionMap("runny nose", "G�zelyal�");
        user.putToConditionMap("fever", "Bal�ova");
        user.putToConditionMap("fever", "Bal�ova");
        user.putToConditionMap("fever", "G�zelyal�");*/

        server.returnList();
    }
}