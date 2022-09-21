// Types of errors :- (1) Syntax Error, (2) Logical Error, (3) Runtime Error or Exception

public class a_ErrorsTypes{
    public static void main(String[] args){
        // SYNTAX ERROR : when compiler finds something wrong with our program, it throws a syntax errors.
        // int a = 2 ---> No semicolon
        // b = 5; ---> Variable not declared


        // LOGICAL ERROR : It is also called as bug and it occurs when a program compiles and runs but does the wrong thing.
        // (1) Message delivered wrongly, (2) Incorrect redirects, (3) Wrong time of chats being displayed

        // eg. write a program to print prime numbers between  1 to 10.
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println((i*2)+1);
        }
    
        // RUNTIME ERROR : Java may sometimes encounter an error while the program is running. These are also called exceptions.
        // These are encountered due to circumstances like bad input and resource constaints.

        System.out.println("1000 divided by 0 is : " + 1000/0);
        // This will throw an arithematic exception (/ by 0).
    }
}