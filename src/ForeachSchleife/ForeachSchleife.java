package ForeachSchleife;

public class ForeachSchleife{
    public static void main(String[] args) {
        String[] names = {"Hendrik", "Herbert", "Lukas Müller"};

        for(String name : names){
            name = "Test";
        }
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}



