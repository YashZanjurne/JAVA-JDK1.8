interface Multiple{
    int mul(int a,int b);
}

public class Multiplication {
    public static void main(String[] args) {
        Multiple multiple =((a,b)->a*b); System.out.println("Multiplication is :" +multiple.mul(10,5));
    }
}
