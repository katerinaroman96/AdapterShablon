package AdapterShablon;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(43, 71));
        System.out.println(calc.mult(12, 10));
        System.out.println(calc.pow(2, 5));
    }
}
