package lab5.advanced;

public class NewIntCalculator extends ACalculator {

    @Override
    public void init() {
        state = 0;
    }

    public NewIntCalculator add(int n) {
        state = (Integer) state + n;
        return this;
    }

    public NewIntCalculator subtract(int n) {
        state = (Integer) state - n;
        return this;
    }

    public NewIntCalculator multiply(int n) {
        state = (Integer) state * n;
        return this;
    }
}
