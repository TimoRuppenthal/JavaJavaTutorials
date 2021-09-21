package Tutorial_10;

public class DoWhileSchleife {
    public static void main(String[] args)
    {
      int number = 1;

      do{
          System.out.println(number);
          number ++;
      }
      while(number <= 5);        //Bedingung wird, im Gegensatz zur WhileSchleife, am Ende der Schleife geprüft --> Fußgesteuert nicht Kopfgesteuert
    }
}
