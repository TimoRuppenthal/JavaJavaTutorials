package Tutorial_13;

import java.sql.SQLOutput;

public class Arrays {

    public static void main(String[] args) {

        String[] names = new String[4]; //Die Größe eines Arrays wir immer bei der Initialisierung festgelegt

        names[0] = "Hendrik";
        names[1] = "Paul";
        names[2] = "Fabienne";
        /*
        System.out.println(names[1]);
        */

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
