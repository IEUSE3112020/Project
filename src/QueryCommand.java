import java.util.Random;

public class QueryCommand implements Command {
    private User user;
    private int count;

    public QueryCommand(User user, int count) {
        this.user = user;
        this.count = count;
    }

    @Override
    public void Execute() {
        for (int i = 0; i < count; i++) {
//            Random rand = new Random();
//            int operationNumber = rand.nextInt(3)+1;
            user.Action(3);
        }
    }
}