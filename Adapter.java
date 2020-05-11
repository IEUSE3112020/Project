public class Adapter implements Library {
    private Phone phone;

    public Adapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void receive() {
        if (phone instanceof Samsung) {
            ((Samsung) phone).get();
        } else if (phone instanceof Iphone) {
            ((Iphone) phone).read();
        }
    }

    @Override
    public void send() {
        if (phone instanceof Samsung) {
            ((Samsung) phone).set();
        } else if (phone instanceof Iphone) {
            ((Iphone) phone).write();
        }
    }
}
