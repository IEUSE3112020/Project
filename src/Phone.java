abstract public class Phone { }

class Iphone  extends Phone{
    public void read() {
        System.out.println("reading from server");
    }

    public Object write(Object o) {
        System.out.println("writing from iPhone to server");
        return o;
    }
}

class Samsung  extends Phone  {
    public void get() {
        System.out.println("get from server");
    }

    public Object set(Object o) {
        System.out.println("set from Samsung to Server");
        return o;
    }
}