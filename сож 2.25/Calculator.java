public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // Тест (main әдіс)
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + (calc.add(2, 3) == 5));
        System.out.println("Subtract: " + (calc.subtract(3, 2) == 1));
        System.out.println("Multiply: " + (calc.multiply(2, 3) == 6));
        System.out.println("Divide: " + (calc.divide(6, 3) == 2));

        try {
            calc.divide(5, 0);
            System.out.println("Divide by zero: false");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero: true");
        }
    }
}