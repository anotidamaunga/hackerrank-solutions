import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner in = new Scanner(System.in);//scanner class to take input for the integer
        System.out.println("Enter the value of n: ");//this is the instruction for the users to put the number that they want to use
        int n = in.nextInt();//this is to read the input and display it on the screen
        int sum = n + i;
        System.out.println("The sum of of the integers is :" + sum);//you probably know what happens here

        Scanner in2 = new Scanner(System.in); //This here is for the double variable.
        System.out.println("Enter the value of d: ");
        double d1 = in2.nextDouble();
        double sumd1 = d1 + d;
        System.out.println("The sum of of the doubles is :" + sumd1);

        Scanner in3 = new Scanner(System.in);//this is for the string
        System.out.println("Enter the value of s: ");
        String s1 = in3.nextLine();
        System.out.println(s + s1);
    }
}
