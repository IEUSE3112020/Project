public class Adapter implements Library {
    private Phone phone;

    public Adapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public Object receive(Object o) {
        if (phone instanceof Samsung) {
            ((Samsung) phone).get();
        } else if (phone instanceof Iphone) {
            ((Iphone) phone).read();
        }

        return null;
    }

    @Override
    public Object send(Object o) {
        if (phone instanceof Samsung) {
            return ((Samsung) phone).set(o);
        } else if (phone instanceof Iphone) {
            return ((Iphone) phone).write(o);
        }

        return null;
    }
}
