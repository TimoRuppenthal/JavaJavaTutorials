package VerschachtelteSchleifen;

public class VerschachtelteSchleifen {
    public static void main(String[] args)
    {
      for(int i = 1; i < 4; i++){ // 3 Schleifendurchläufe da bis zur 4 erhöht wird

          for(int j = 1; j < 4; j++){ // Bei der inneren Schleife auch 3 Durchläufe
              System.out.print("x "); // Die erste Zeile kommt zustande, da die äußere bei einem Durchlauf einmal ausgeführt wird, die innere allerdings direkt 3 mal
          }
          System.out.println();
      }
    }
}
