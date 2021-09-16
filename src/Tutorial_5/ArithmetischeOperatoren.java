package Tutorial_5;

public class ArithmetischeOperatoren {
    public static void main(String[] args)
    {
        int number1 = 3 + 4;            //bevor zugewiesen wird, wird rechts ausgewertet
        System.out.println(number1);    //die 7 wird dann an den Zuweisungsoperator "number1" übergeben und schließlich ausgegeben

        int number2 = 7 - 4;
        System.out.println(number2);

        int number3 = 4 * 2;
        System.out.println(number3);

        int number4 = 12 / 6;
        System.out.println(number4);

         int number5 = 3;
         int number6 = 5;
         int result = number1 + number2;
        System.out.println(result);

        int number7 = 3;
        int number8 = 5;
        System.out.println(number7 + "" + number8);      //Verkettung
    }

}
