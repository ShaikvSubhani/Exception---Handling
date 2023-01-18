public class Main {
    public static void main(String[] args) {
        System.out.println("before try");

        int i=10;
        int j=0;

        try{
            int k=i/j;
            int[] arr={1,2,3,4};
            System.out.println(arr[0]);
        }
        //catching the exception
        catch (ArithmeticException e)
        {
            System.out.println("you are dividing by zero"+e);
        }
        catch(Exception e)
        {
            System.out.println("I will handle all exception, dont worry"+e);
        }
        finally {
            System.out.println("no matter the exception handle or not finally will get executed");
        }


        //with try catch, means if you dont handle the exception, no statement after it will get executed.
        //but if you are handling the exception,it will be executed.


        System.out.println("after try");
        try {
            fun(5);
        }
        catch(Exception e)
        {
            System.out.println("you are still small"+e.getMessage());
        }
        try {
            fun(5);
        }
        catch(UnderAgeException e)
        {
            System.out.println("bhai chota h thu");
        }

    }
    public static void fun() throws ArithmeticException
    {
        int i=10;
        int j=0;
        int k=i/j;
    }
    public static void fun(int age) throws UnderAgeException
    {
        if(age<18) {
            throw new UnderAgeException("age is less then 18");
        }
    }

    //customised exception
    //In customised exception you need to use throws
    public static class UnderAgeException extends Exception{
        public UnderAgeException(String message)
        {
            super(message);
        }
    }
}