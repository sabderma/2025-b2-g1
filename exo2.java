import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pour commencer le compte à rebours, cliquez sur 'yes' : ");
        String nom = scanner.nextLine();
        
        if (nom.equals("yes")) {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); 
                
            }
            System.out.println("lencement");
           
        }

        scanner.close();
    }
}
