package lab5;
class IntCalculator{
    int state;

    IntCalculator(int state){
        this.state=state;
    }
    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

    public int result() {
        return this.state;
    }

}
class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int state) {
        super(state);
    }
    public AdvancedCalculator add(int value) {
        this.state += value;
        return this;
    }

    public AdvancedCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public AdvancedCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public AdvancedCalculator clear() {
        this.state = 0;
        return this;
    }
    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            this.state /= value;
        }
        else
            System.out.println("Nu putem impartii la 0");
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        this.state = (int) Math.pow(this.state, exponent);
        return this;
    }

    public AdvancedCalculator sqrt(int n) {

        this.state = (int) Math.pow(this.state, 1.0 / n);
        return this;
    }
}

public class AppLab5 {
    static void main() {
        AdvancedCalculator calculator = new AdvancedCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        System.out.println("b) " + calculator.sqrt(2).result());
    }
}
