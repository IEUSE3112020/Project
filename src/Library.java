// Library interface is 'Target' in terms of Adapter Pattern
public interface Library {
    Object receive(Object o);
    Object send(Object o);
}