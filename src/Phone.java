abstract public class Phone { }

class Iphone extends Phone {
    public void read() {
        System.out.println("reading from iPhone");
    }

    public void write() {
        System.out.println("writing to iPhone");
    }
}

class Samsung extends Phone {
    public void get() {
        System.out.println("get from samsung");
    }

    public void set() {
        System.out.println("set to samsung");
    }
}
