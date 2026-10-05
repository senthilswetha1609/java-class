 import java.util.Scanner;
class q1{
    public static void main (String [] args)
    {
        Scanner swea = new Scanner (System.in);
        int a = swea.nextInt();

        if(a/3){
            System.out.println("the num is divisible by 3 and 5");
        }
        else{
             System.out.println("the num is not divisible by 3 and 5");

        }

    }
}