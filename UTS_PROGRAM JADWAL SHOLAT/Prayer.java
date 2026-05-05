// Abstract class (ABSTRACTION)
public abstract class Prayer {
    protected String time;

    public Prayer(String time) {
        this.time = time;
    }

    public abstract void remind(); // harus dioverride
}