package JavaBasics.Arrays;
import java.util.Scanner;
//Array is a collection of similar type of data.
public class array_1_basic {
    public static void main (String[] args){
        int []students=new int[5];
        for(int i=0;i<students.length;i++){
            System.out.println("Enter the "+i+"th"+"element : ");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            students[i]=x;
            System.out.println("Student["+i+"]="+x+".");
        }
    }
}

/*
output:
        Enter the 0thelement :
        1
        Student[0]=1.
        Enter the 1thelement :
        2
        Student[1]=2.
        Enter the 2thelement :
        4
        Student[2]=4.
        Enter the 3thelement :
        6
        Student[3]=6.
        Enter the 4thelement :
        8
        Student[4]=8.
*/