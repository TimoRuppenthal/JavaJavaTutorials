package Tutorial_14;

public class Foreach
{

    public static void main(String[] args)
    {
       String[] names = {"Hendrik", "Herbert", "Lukas Müller"};

       for(String name : names){
           name = "Test";

       }
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
