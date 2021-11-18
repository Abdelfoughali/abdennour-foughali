package primitives;

public class arithmeticPractice {
    public static void main(String[] args) {
        // addition==>+
        int num1= 3;
        int num2 = 4;
        System.out.println("total is:"+(num1+num2));
        System.out.println(num1+num2);
        int sum = num1 + num2;
        System.out.println(sum);

        // substraction --->
        int difference;
        difference =10-num2;
        System.out.println("deifference is" + difference);
         // multiplication-->
        double product = difference  * num2;
        System.out.println(product);
       double division = product / 3 ;
        System.out.println(division);
        product = product + division;
        System.out.println((product));

        int division1= 5 /2 ;//
        System.out.println(division);
        double division3 = 5/2;
        System.out.println(division3);

        float division4 = 5/2f;
        System.out.println(division4);

        // remainder---> left over ---> (modulus)
        int a = 10;
        int b = 3;
       int remainder1 = a % b;
        System.out.println(" the left over of 11/5 is = "+remainder1);
        int x = 13;
        int y =5 ;
        int remainder2 = x %y;
        System.out.println(remainder2);
        int result = a + b *x - y / a * b + x % 2 ;
        System.out.println(result);



    }
}
