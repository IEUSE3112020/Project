public class QueryCommand implements Command {
    private User user;
    private int count;

    public QueryCommand(User user, int count) {
        this.user = user;
        this.count = count;
    }

    @Override
    public void Execute() {
        for (int i = 1; i <= count; i++) {
            user.Action(i);
        }
    }
}