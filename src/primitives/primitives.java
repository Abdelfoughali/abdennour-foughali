package primitives;

public class primitives {
    public static void main(String[] args) {
         // modulus --> % --> remainder (left over division)

        int number1 =45;
        int number2 = 6;
        int remainder1 = number1%number2;
        System.out.println("remaider1 is>>"+remainder1);
        // find the sum of digit from given number
        // 123 -->> 1+2+3= 6 ===> sout (sum is >> <sum>)
        // 123 %  10 --->3
        // 12 % 10  --->2
        // 1 % 10 -->1
        int myNumber =123;
        int digit3 =myNumber %10;
        myNumber = myNumber/10;
        int digit2 = myNumber % 10;
        myNumber=myNumber /10;
        int digit1 = myNumber %10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        int sum = digit1+digit2+digit3;
        System.out.println( "the sum is= "+sum);

        // find the prduct of 456
        int myNumber1 =456;
        int digit4 = myNumber1%100;
        myNumber1=myNumber1/10;
        int digit5= myNumber1%10;
        myNumber1=myNumber1/10;
        int digit6= myNumber1%10;
        int product = digit4*digit5*digit6;
        System.out.println("product is"+(digit4*digit5*digit6));









    }






}
