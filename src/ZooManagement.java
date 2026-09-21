//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        while (zooName.isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
            System.out.print("Entrez le nom du zoo : ");
            zooName = scanner.nextLine();
        }
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        while (nbrCages <= 0) {
            System.out.println("Le nombre de cages doit être positif.");
            System.out.print("Entrez le nombre de cages : ");
            nbrCages = scanner.nextInt();
        }
        System.out.println(zooName + " contient " + nbrCages + " cages");

        scanner.close();
    }
}