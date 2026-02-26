package Exception;

class AdarshException extends Exception {
    public AdarshException(String string) {
        super(string);
    }
}

class A {
    public void show() throws ArithmeticException {
        System.out.println(3 / 0);
    }
}

public class Exceptions {
    public static void main(String[] args) {

        try {
            Class.forName("Exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Hey bro class is not found" + e.getMessage());
        }

        int i = 12;
        int j = 0;
        int[] arr = new int[4];

        A g = new A();

        try {
            g.show();
        } catch (ArithmeticException e) {
            System.out.println("Custom class error catched " + e.getMessage());
        }

        try {
            if (j == 0) {
                throw new ArithmeticException("J is 0 || Use the default value !!");
            }
            System.out.println("i/j: " + i / j);
            System.out.println("Element in index 5: " + arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("The default value: " + i / 1);
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong with access of array: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong with access of array: " + e);
        }
    }
}
