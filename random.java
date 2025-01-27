//day 1
// EX-2

import java.util.Random;

class random{
    public static void main(String[] args){
        Random ra = new Random();
        int num1 = ra.nextInt(100);
        int num2 = ra.nextInt(100);

        System.out.println("num1 is : "+num1);
        System.out.println("num2 is : "+num2);

        System.out.println(num1+num2);
    }
}
