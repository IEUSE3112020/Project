  
// Library interface is 'Target' in terms of Adapter Pattern
public interface Library {
    public Object receive(Object o);
    public Object send(Object o);
}