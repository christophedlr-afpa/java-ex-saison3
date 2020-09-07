import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.*;

public class Main {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int choice = 0;
        boolean valid = false;
        Main m = new Main();

        while (!valid) {
            System.out.println("Choisissez votre action");
            System.out.println("1. Algorithme 3.5");
            System.out.println("2. Algorithùe 3.6");

            choice = Integer.parseInt(m.reader.readLine());

            if (choice == 1) {
                valid = true;
                m.algo35();
            }
            else if (choice == 2) {
                valid = true;
                m.algo36();
            }
            else {
                valid = false;
                System.out.println("Choix invalide");
            }
        }
    }

    public void algo35() {
        int num = 0;

        System.out.print("Donnez un nombre : ");

        try {
            num = Integer.parseInt(reader.readLine());

            if (num == 0) {
                System.out.println("Votre nombre est nul (0)");
            }
            else if (num < 0) {
                System.out.println("Votre nombre "+num+" est négatif");
            }
            else {
                System.out.println("Votre nombre est positif");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void algo36() {
        int childAge = 0;

        System.out.print("Donnez moi l'âge d'un enfant : ");
        try {
            childAge = Integer.parseInt(reader.readLine());

            if (childAge == 6 || childAge == 7) {
                System.out.println("L'enfant est un Poussin");
            }
            else if (childAge == 8 || childAge == 9) {
                System.out.println("L'enfant est une Pupille");
            }
            else if (childAge == 10 || childAge == 11) {
                System.out.println("L'enfant est Minime");
            }
            else if (childAge >= 12) {
                System.out.println("L'enfant est un Cadet");
            }
            else {
                System.out.println("L'âge est invalide pour ce travail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
