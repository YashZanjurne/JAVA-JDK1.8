import lambda.LengthInter;
import lambda.MyInter;
import lambda.MyInterImpl;
import lambda.SumInter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // interface accessing without lambda old method...
        MyInterImpl myInter = new MyInterImpl();
        myInter.sayHello();


        // use lambda
        MyInter i = ()-> System.out.println("First time use lambda");
        i.sayHello();

        MyInter i2 =()-> System.out.println("Second time use lambda");
        i2.sayHello();

        //Lambda use only with functional Interface....
        // Functional interface means only one abstract method present in interface is call functional interface...

        SumInter sumInter=(int a,int b)->{
            return a+b;
        };
        System.out.println(sumInter.sum(5,6));
        System.out.println(sumInter.sum(4,6));

        SumInter sumInter1=(a,b)->a+b;
        System.out.println("Sum = "+sumInter1.sum(3,4));


        // Length of String....
        LengthInter lengthInter = str -> str.length();
        System.out.println("Length of String is : " +lengthInter.getLength(  "yash"));


    }
}