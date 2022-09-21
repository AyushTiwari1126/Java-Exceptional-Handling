// If the method can give the results perfectly, then return. And, if it is not possible then throw an exception.

// Throw : It is used for throwing the exception.
// Throws : It is used for defining the exception.

public class e_Throw_Throws{
    static class negativeRadiusException extends Exception{
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Radius can't be negative";
        }
        @Override
        public String getMessage() {
            // TODO Auto-generated method stub
            return "Radius can't be negative";
        }

    // first example 
    public static int divide(int a, int b) throws ArithmeticException{
            int result = a/b;
            return result;
    }

    // second example
    public double area(double r) throws negativeRadiusException{
        if (r<0){
            throw new negativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    // third example
    static int area(int l, int w) throws Exception{
        if(l<0 || w<0)
            return l*w;
    }
    public static int method1 throws Exception{
        System.out.println("Area is " + area(10,5));
    }
    public static void main(String[] args){
        try{
            int c = divide(4, 0);
            System.out.println(c);
 
            // double area = area(6);
            // System.out.println(area);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        
    }
}