public class MathOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Unary Operators
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("Post Increment: " + (x++));
        System.out.println("After Post Increment: " + x);
        System.out.println("Pre Increment: " + (++x));

        // Assignment Operators
        int y = 10;
        y += 5;
        System.out.println("\nAssignment Operator result: " + y);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        boolean c1 = true;
        boolean c2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("c1 && c2: " + (c1 && c2));
        System.out.println("c1 |c2:  " + (c1 || c2));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator - Max value: " + max);
    }
} 