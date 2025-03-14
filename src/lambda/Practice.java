// Q: Write a program to use a lambda expression to implement a functional interface...

package lambda;

interface Demo{
    int num(int a,int b);
}


public class Practice {
    public static void main(String[] args) {
    Demo pp = ((a, b)-> a+b);
        System.out.println("Sum is " +pp.num(5,10));

        Demo pp2 = ((a , b)->a*b);
        System.out.println("Multipication is " +pp2.num(10,5));
    }
}
