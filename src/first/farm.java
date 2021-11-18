package first;

public class farm {
    public static void main(String[] args) {
        /* in the farm there are 12 cows and 23 chicken
        1- find the total legs of the animals in the farms and print out
        2- if each  cow cost $ 2345 and chicken costs $ 23.99
        find the total worth these animals and print out
         */

        int cow =12;
        int chik =23;
        int leg = cow*4 + chik*2;
        System.out.println("total of the leg"+leg);
        double cow1= 2345;
        cow1= 2345*12;
        double chik1=23.99;
        chik1=23.99*23;
        double cost = cow1+chik1;
        System.out.println(cost);




    }



}
