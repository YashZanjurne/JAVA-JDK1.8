// Addtion of two numbers Using Lambda

interface AddNumbers{
    public abstract int add(int a,int b);
}

public class Addition {
    public static void main(String[] args) {
        AddNumbers sum =((a, b) -> a+b);
        System.out.println("Sum is " +sum.add(10,20));
    }
}
