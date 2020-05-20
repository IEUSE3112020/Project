public class Adapter implements Library {
    private OperatingSystem operatingSystem;

    public Adapter(OperatingSystem os) {
        this.operatingSystem = os;
    }

    @Override
    public Object receive(Object o) {
        if (operatingSystem instanceof Samsung) {
            ((Samsung) operatingSystem).get();
        } else if (operatingSystem instanceof Iphone) {
            ((Iphone) operatingSystem).read();
        }

        return null;
    }

    @Override
    public Object send(Object o) {
        if (operatingSystem instanceof Samsung) {
            return ((Samsung) operatingSystem).set(o);
        } else if (operatingSystem instanceof Iphone) {
            return ((Iphone) operatingSystem).write(o);
        }

        return null;
    }
}