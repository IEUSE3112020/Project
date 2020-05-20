// Subject class is an abstract class for concreteSubject which
// is User class in our project.
public abstract class Subject {

    Server server;

    public void Attach(Server server){
        this.server = server;
    }

    public void Detach(Server server){
        this.server = null;
    }

    public void Notify(){
        this.server.Update(this);
    }
}