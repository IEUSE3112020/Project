import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Condition> conditionList = new ArrayList<>();

        Server server = Server.getServer();

        String user1PhoneNumber = "05071223053";
        User user1 = new User("Yağızcan Arslan", 30, "Güzelyalı", new Samsung());
        user1.Attach(server);
        server.putToPhoneMap(user1PhoneNumber, user1);

        user1.putToConditionMap("fever", "Konak");
        Thread.sleep(2000);
        user1.putToConditionMap("runny nose", "Narlıdere");
        Thread.sleep(2000);
        user1.putToConditionMap("runny nose", "Balçova");
        Thread.sleep(2000);
        user1.putToConditionMap("normal", "Güzelyalı");
        Thread.sleep(2000);
        user1.putToConditionMap("normal", "Özdere");
        Thread.sleep(2000);

        String user2PhoneNumber = "12312312321";
        User user2 = new User("Berkin Yıldıran", 26, "Narlıdere", new Samsung());
        user2.Attach(server);
        server.putToPhoneMap(user2PhoneNumber, user2);

        user2.putToConditionMap("runny nose", "Güzelyalı");
        Thread.sleep(2000);
        user2.putToConditionMap("runny nose", "Güzelyalı");
        Thread.sleep(2000);
        user2.putToConditionMap("fever", "Balçova");
        Thread.sleep(2000);
        user2.putToConditionMap("fever", "Balçova");
        Thread.sleep(2000);
        user2.putToConditionMap("fever", "Güzelyalı");

        Adapter adapter = new Adapter(user1.getOperatingSystem());

        adapter.receive();
        adapter.send();

        server.returnList();

        // sağlık bakanlığı serverına adapter aracılığıyla query gönder
    }
}
