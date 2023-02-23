public class ArithematicOperators {

    int numberOne;
    int numberTwo;
    int result;

    void sum() {
        result = numberOne + numberTwo;
        System.out.println("Sum of " + numberOne + " and " +
                numberTwo + " is " + result);
    }

    void sub() {
        result = numberOne - numberTwo;
        System.out.println("Subtraction of " + numberOne + " and " +
                numberTwo + " is " + result);
    }

    void mul() {
        result = numberOne * numberTwo;
        System.out.println("Multiplication of " + numberOne + " and " +
                numberTwo + " is " + result);
    }

    void div() {
        result = numberOne / numberTwo;
        System.out.println("Division of " + numberOne + " and " +
                numberTwo + " is " + result);
    }

    public static void main(String[] args) {

        ArithematicOperators obj = new ArithematicOperators();
        obj.numberOne = 20;
        obj.numberTwo = 10;
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();

        System.out.println();
        System.out.println("=====================================================");

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // Check the difference in d++ and ++d
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }

}
