import java.util.HashMap;
import java.util.Map;

public class User extends Subject {

    private String name;
    private int age;
    private String address;
    private Phone operatingSystem;

    private Map<Long, String> physicalConditionMap;

    public User(String name, int age, String address, Phone operatingSystem) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.operatingSystem = operatingSystem;
        this.physicalConditionMap = new HashMap<>();
    }

    public void putToConditionMap(String physicalCondition) {
        long time = System.currentTimeMillis();
        this.physicalConditionMap.put(time, physicalCondition);

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

    public Phone getOperatingSystem() {
        return operatingSystem;
    }
}