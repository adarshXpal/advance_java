package LambdaExpression;

@FunctionalInterface
interface A {
    int show(int t);
}

public class LambdaExpression {
    public static void main(String[] args) {
        int i = 98;
        A obj= (t)-> t+1;
        System.out.println(obj.show(i));
    }
}
