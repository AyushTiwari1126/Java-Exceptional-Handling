// Checked Exception : A checked exception must be handled by try-catch or re-throwing. A runtime is not required to be handled.
// eg. (1)ClassNotFoundException, (2)IOException, (3)FileNotFoundException

// Unchecked Exception : An unchecked exception is a programming error also known as runtime error.
// eg. (1)ArithematicException, (2)IndexOutOfBoundsException, (3)IllegalArgumentException, (4)NullPointerException
class LowBalanceException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Balance should not be less than 5000";
    }
}
public class d_Checked_Unchecked{
    static void func1(){
        try{
            throw new LowBalanceException();
        }
        catch(LowBalanceException e){
            System.out.println(e);
        }
    }
    static void func2 (){
        func1();
    }
    static void func3 (){
        func2();
    }
    public static void main(String[] args){

    }
}