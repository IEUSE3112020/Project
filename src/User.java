import java.text.SimpleDateFormat;
import java.util.*;

public class User extends Subject {

    private String name;
    private int age;
    private String address;

    private Map<Long, String[]> physicalConditionMap;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.physicalConditionMap = new HashMap<>();
    }

    public void putToConditionMap(String physicalCondition, String currentLocation) {
        long time = System.currentTimeMillis();
        this.physicalConditionMap.put(time, new String[] {physicalCondition, currentLocation});

        Notify();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void Action(int operation) {
        List<Long> sortedKeys = new ArrayList<>(physicalConditionMap.keySet());
        sortedKeys.sort(Collections.reverseOrder());
        long lastTime = sortedKeys.get(0);

        switch (operation) {
            case 1:
                System.out.println("\t\tUsers current location:" + physicalConditionMap.get(lastTime)[1]);
                break;
            case 2:
                String lastCondition = physicalConditionMap.get(lastTime)[0];
                System.out.println("\t\tUsers last condition: " + lastCondition);
                break;
            case 3:
                SimpleDateFormat sdf = new SimpleDateFormat("d MMM y, HH:mm:ss, S");
                Date resultTime = new Date(lastTime);

                System.out.println("\t\tLast time user entered condition info: " + sdf.format(resultTime));
                break;
            default:
                System.out.println("\t\tNot defined");
                break;
        }
    }
}