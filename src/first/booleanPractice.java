package first;

public class booleanPractice {
    public static void main(String[] args) {
        boolean isHungry = true;
        System.out.println(isHungry);
    boolean islIGHT = false;
        System.out.println(islIGHT);
        System.out.println(true);
        System.out.println(isHungry==islIGHT);
        islIGHT=isHungry;
        islIGHT=false;
        System.out.println("last version for is HUngry"+isHungry);//true
        System.out.println("last for is light>>"+islIGHT); // false

    }
}
