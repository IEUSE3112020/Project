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