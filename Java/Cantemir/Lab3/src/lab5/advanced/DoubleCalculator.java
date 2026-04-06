package lab5.advanced;

public class DoubleCalculator extends ACalculator {

    @Override
    public void init() {
        state = 0.0;
    }

    public DoubleCalculator add(double n) {
        state = (Double) state + n;
        return this;
    }

    public DoubleCalculator subtract(double n) {
        state = (Double) state - n;
        return this;
    }

    public DoubleCalculator multiply(double n) {
        state = (Double) state * n;
        return this;
    }
}
