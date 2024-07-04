public abstract class Phone {
    public String user;

    public Phone(String user) {
        this.user = user;
    }

    abstract void printLogo();
    abstract void buy();
    abstract void turnOn();
}
