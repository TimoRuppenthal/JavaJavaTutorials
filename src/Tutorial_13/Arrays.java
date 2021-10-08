package Tutorial_13;

public class Arrays
{

    public static void main(String[] args)
    {
       String[] names = new String[3]; //Die Größe eines Arrays wird immer bei der Initialisierung festgelegt

        names[0] = "Hendrik";
        names[1] = "Paul";
        names[2] = "Herbert";

        System.out.println(names[1]);

         /*
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }     */

        for(int i = 2; i > -1 ; i--){
            System.out.println(names[i]);
        }
    }
}
