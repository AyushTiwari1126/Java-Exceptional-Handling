import java.util.Scanner;
public class g_ExceptionPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// Demonstrate syntax, logical and runtime error.
        // Syntax error
        // a = 5; ---> Not declared the variable 'a'.
        // int b = 6 ---> Not use the ';'

        // Runtime error
        // System.out.println(10/0);

// Write a program that prints "A" during Arithematic Exception and prints "B" during an Illegal argument Exception.
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("A : Arithmeticexception");
        }
        catch(IllegalArgumentException e){
            System.out.println("B : IllegalArgumentException");
        }

// Write a program that allows us to keep accessing an array until a valid index is given. If max retries exceed 5, print "Error".
        int[] array = {16, 76, 32, 8, 55};
        boolean flag = true;
        int i=0;
        while(flag && i<5){
            try{
                System.out.print("Enter the index : ");
                int index = sc.nextInt();
                System.out.println("The value at this index is " + array[index]);
                break;
            }
            catch(Exception e){
                System.out.println("invalid Index");
                i++;
            }
        }
        if (i>=11){
            System.out.println("Error");
        }
    }
}
