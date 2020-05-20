public class MobilePhone  {
    private OperatingSystem operatingSystem;

    MobilePhone (OperatingSystem os) {
        this.operatingSystem = os;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}