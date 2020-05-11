import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Condition> conditionList = new ArrayList<>();
        Server server = Server.getServer();

        User user1 = new User("asd", 123, "asdasdasddasd", new Samsung());
        user1.Attach(server);
        server.getTheList().add(user1);

        user1.putToConditionMap("fever");
        user1.putToConditionMap("runny nose");

        Adapter adapter = new Adapter(user1.getOperatingSystem());

        adapter.receive();
        adapter.send();

        server.getTheList();

        // sağlık bakanlığı serverına adapter aracılığıyla query gönder
    }
}
