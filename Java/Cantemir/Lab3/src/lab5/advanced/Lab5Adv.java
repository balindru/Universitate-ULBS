package lab5.advanced;


public class Lab5Adv {
    static void main(String[] args) {

        NewIntCalculator in = new NewIntCalculator();
        in.init();
        in.add(10).add(5).subtract(3).multiply(2);
        System.out.println(in.result());

        DoubleCalculator db = new DoubleCalculator();
        db.init();
        db.add(10).add(5).subtract(3.3).multiply(2.2);
        System.out.printf("%.2f%n", db.result());
    }
}
