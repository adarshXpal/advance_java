package Demo;

interface Computer {
    void code();

    int num = 13;
}

interface Mobile {
    void code();

    void media();

    int num = 24;
}

abstract class Ramesh {
    abstract void krint(int self);

    abstract void slint(int self);
}

class Desktop implements Computer, Mobile {
    public void code() {
        System.out.println("Coding...Compliling...Developing: Faster " + Computer.num + "X Times");
    }

    public void media() {
        System.out.println("Watching Movies and videos: Faster " + Mobile.num + "X Times");
    }

    public void chuc() {
        System.out.println("Hi I am Chuck");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding...Compiling...Developing");
    }
}

class Developer {
    public void develop(Computer com) {
        com.code();
        System.out.println("coding ..... and Developed");
    }
}

public class InnerClass {
 public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        // TODO: Handle division using try-catch
        try{
            if(denominator==0){
                throw new ArithmeticException("Hey the denominator is zero");
            }
            int result=numerator/denominator;
            System.out.println("Program completed");
        }
        catch(Exception e){
            System.out.println("Cannot divide by zero "+e.getMessage());
        }
    }
}
