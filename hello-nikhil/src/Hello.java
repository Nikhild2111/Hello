import java.sql.SQLOutput;

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello Nikhil");
        Greeting.displaying();
        System.out.println("Bye Bye");
    }
}

class Greeting{

    static void displaying(){
        System.out.println("Hello Nikhil,how are you");
    }
}