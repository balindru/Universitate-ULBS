package lab5.advanced;

public abstract class ACalculator {
    Object state;

    public Object result() {
        return state;
    }

    public void clear() {
        state = null;
    }

    public abstract void init();
}
