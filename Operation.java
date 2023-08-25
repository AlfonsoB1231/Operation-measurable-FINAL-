public abstract class Operation {
    public abstract double plus(double x, double y);

    public abstract double minus(double x, double y);

    public abstract double multiply(double x, double y);

    public void getMessage(String message) {
        System.out.println(message);
    }
}
