package SwitchCaseAbfrage;

public class SwitchCaseAbfrage {
    public static void main(String[] args)
    {
        int number = 2;

        switch(number){
            case 1: System.out.println("Number hat den Wert 1"); break;
            case 2: System.out.println("Number hat den Wert 2"); break;
            case 3: System.out.println("Number hat den Wert 3"); break;
            default: System.out.println("Number hat einen anderen Wert...");
        }



        int month = 2;

        switch(month){
            case 1: System.out.println("Januar"); break;
            case 2: System.out.println("Februar"); break;
            case 3: System.out.println("März"); break;
            case 4: System.out.println("April"); break;
            default: System.out.println("Anderer Monat"); break;
        }
    }
}
