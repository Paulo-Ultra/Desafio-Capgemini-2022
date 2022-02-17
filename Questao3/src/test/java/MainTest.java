import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<String> letrAnag;
            int numAnag;

        System.out.println("Digite a palavra para verificar pares de strings que são anagramas: ");
            String str = sc.nextLine();

            letrAnag = Anagrama.LetrasAnagramas(str); //Traz os elementos Strings com array de tamanho 55
            numAnag = Anagrama.NumAnagramas(letrAnag); //Traz o número de anagramas, no caso "ifailuhkqq" possui 3 apenas

            System.out.println(letrAnag);
            System.out.println(numAnag);

    }
}
