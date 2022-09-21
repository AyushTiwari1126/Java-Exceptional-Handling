// Exceptions : An event that occurs when a program is executed disrupting the normal flow of instructions.
// There are two types of exceptions :- 
// (1) Checked Exceptions ---> Compile Time(Handled by compiler) 
// (2) Unchecked Exceptions ---> Runtime Exceptions

// Commonly Occuring Exceptions :- (1) Null Pointer exception, (2) Arithematic exceptions, (3) Array IndexOutofBound Exception
                                // (4) Illegal argument exceptions, (5) NumberFormat exception
                                
import java.util.Scanner;

public class b_TryCatchBlock {
    public static void main(String[] args){

        // eg. Arithematic exception
        int a = 60;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("the result is : " + c);
        }
        catch(Exception e){
            System.out.println("Failed to divide by zero.");
        }


        // eg. Another exceptions example
        Scanner sc = new Scanner(System.in);
        int[] array = {25, 60, 7};

        System.out.print("Enter the index of array : ");
        int i = sc.nextInt();
        System.out.print("Enter the number by which you want to divide the element : ");
        int n = sc.nextInt();
        try{
            System.out.print("The answer of array-element/number is : " + (array[i]/n));
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured!");
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBounds Exception occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }


        // Nested Try Catch Block : When a try catch block is present in another try block then it is called the nested try catch block.
        // example :-
        System.out.println("This is Nested Try Catch Block example.");
        int marks[] = {6, 8, 18, 5, 9, 13, 2};
        System.out.print("Enter the index of marks-array : ");
        int index = sc.nextInt();
        try{
            try{
                System.out.println("The element present on the "+ index + "th index is : " + marks[index]);
            }
            catch(Exception e){
                System.out.println("Sorry, "+ index +"th index does not exist in marks-array");
                System.out.println("Exception in level2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level1");
        }
    }
}
