import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.algo35();
    }

    public void algo35() {
        int num = 0;

        System.out.print("Donnez un nombre : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
}
