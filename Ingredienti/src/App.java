import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingredienti");
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Nome Del Ingrediente");
        String Nome = sc.nextLine();
    
        System.out.println("Descrizione Ingrediente");
        String Descrizione = sc.nextLine();
    
        System.out.println("Prezzo del Ingrediente");
        Double Prezzo = sc.nextDouble();
    
        System.out.println("Disponibile");
        Boolean Disponibile = sc.nextBoolean();
    
        System.out.println("Tipo di Ingrediente");
        byte Tipo = sc.nextByte();
        
        System.out.println("Allergeni");
        String Allergeni = sc.nextLine();
    
        System.out.println("Foto Ingrediente");
        String Foto = sc.nextLine();

        System.out.println("MOdalita di Conservazione");
        String Conservazione= sc.nextLine();

        sc.close();

        
    
        System.out.println("Nome Piatto: " + Nome);
        System.out.println("Descrizione Piatto: " + Descrizione);
        System.out.println("Prezzo Piatto: " + Prezzo);
        System.out.println("Disponibilita: " + Disponibile);
        System.out.println("Tipo di Piatto: " + Tipo);
        System.out.println("Allergeni: " + Allergeni);
        System.out.println("Foto: " + Foto);
        System.out.println("Modalita di Conservazione: " + Conservazione);
        
    
    
        
        
        
        
        
        
            
            
        
     }
    }