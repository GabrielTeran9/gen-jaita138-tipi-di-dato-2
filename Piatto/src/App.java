import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Nome Piatto");
    String Piatto = sc.nextLine();

    System.out.println("Descrizione Piatto");
    String Descrizione = sc.nextLine();

    System.out.println("Prezzo del Piatto");
    Double Prezzo = sc.nextDouble();

    System.out.println("Disponibile");
    Boolean Disponibile = sc.nextBoolean();

    System.out.println("Tipo di Piatto");
    byte Tipo = sc.nextByte();
    
    System.out.println("Allergeni");
    String Allergeni = sc.nextLine();

    System.out.println("Foto");
    String Foto = sc.nextLine();

    System.out.println("Calorie");
    String Calorie = sc.nextLine();

    System.out.println("Variazioni");
    String Variazioni = sc.nextLine();

    sc.close();
    
    sc.nextLine();

    System.out.println("Nome Piatto: " + Piatto);
    System.out.println("Descrizione Piatto: " + Descrizione);
    System.out.println("Prezzo Piatto: " + Prezzo);
    System.out.println("Disponibilita: " + Disponibile);
    System.out.println("Tipo di Piatto: " + Tipo);
    System.out.println("Allergeni: " + Allergeni);
    System.out.println("Foto: " + Foto);
    System.out.println("Calorie: " + Calorie);
    System.out.println("Variazioni: " + Variazioni);

    
    
    
    
    
    
        
        
    
 }
}
