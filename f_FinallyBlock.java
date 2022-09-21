// Finally Block : It contains the code which is always executed whether the exception is handled or not.
// It is used to executed code containing instructions to release the system resources, close a connection. 

public class f_FinallyBlock {
    // first example
    public static int result(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println("This is an exception - " + e);
        }
        finally{
            System.out.println("This is in finally block, this is the end of this function.");
        }
        return 0;
    }
    public static void main(String[] args){  
        int res = result(); 
        System.out.println(res);


        // Another example
        int x = 10;
        int y = 7;
        while (true){
            try{
                System.out.println(x/y);
            }
            catch(Exception e){
                System.out.println("An exception occured :- " + e);
                break;
            }
            finally{
                System.out.println("This is finally for value of y = " + y);
            }
            y--;
        }


        // we can write try block without written catch block but In this case finally block can be written compulsory.
        try{
            System.out.println(50/0);
        }
        finally{
            System.out.println("This is finally without catch block.");
        }
    }
}
