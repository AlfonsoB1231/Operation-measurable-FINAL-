public class Number extends Operation implements Measurable {
    private double number1;
    private double number2;
    private double result;

    public Number(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public double plus(double x, double y) {
        return x + y;
    }

    @Override
    public double minus(double x, double y) {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    public void calculate() {
        result = plus(number1, number2);
    }

    @Override
    public double getMeasure() {
        return result;
    }

    public static void main(String[] args) {
        Number num = new Number(10, 5);
        num.calculate();
        System.out.println("Result: " + num.getMeasure());
    }
}
