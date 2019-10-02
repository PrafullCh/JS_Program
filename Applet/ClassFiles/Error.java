import java.util.*;

class Error extends Exception{
    public Error()
    {
        super("Authentication Failure ");
    }
    public static void main(String[] a)
    {
        String password;
    Scanner sc= new Scanner(System.in);
        try{
            System.out.println(" Enter pasword");
            password =sc.nextLine();
            if(password=="prafull")
                System.out.println("passed");
            else
                throw new Error();
        }
        catch(Error e){
            System.out.print(e+" password do not match");
        }
    }
}