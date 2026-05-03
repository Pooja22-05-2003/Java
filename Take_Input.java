import java.util.*;


public class Take_Input {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Name:" + name);

        System.out.println("Enter number you want to print:");
        int count=sc.nextInt();
        System.out.println("Count:"+count);

        System.out.println("Enter two numbers you want to add");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is :" + sum);

    }
 }


