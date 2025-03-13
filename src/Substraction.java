interface Minus{
    public abstract int sub(int a,int b);
}

public class Substraction {
    public static void main(String[] args) {
        Minus substract =( a, b)->{
            return a-b;
        };
        System.out.println("Substraction is " +substract.sub(20,5));
    }
}
