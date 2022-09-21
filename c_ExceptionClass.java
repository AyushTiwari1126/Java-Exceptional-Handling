import java.util.Scanner;

// Exception Class : To create our custom exception by using exception class.

// Exception class has following methods :-
// (1) String toString() ---> Executed when System.out.println is run
// (2) void printStackTrace() ---> Prints Stack Trace.
// (3) String getMessage() ---> Prints Exception message.

class myException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I'm toString()";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "I'm getMessage()";
    }
}
class maxAgeException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Age can't be greater than 100";
    }
    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct.";
    }
}
public class c_ExceptionClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        if (a>100){
            try{
                // throw new myException();
                throw new maxAgeException();
                // throw new ArithmeticException("This is an arithematic exception");
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e); // ---> This will give toString() method bydefault

                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
