import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Teste da questão 01
        Escada escadinha = new Escada();
        System.out.println("Digite quantos degraus deseja que sejam impressos: ");
        int degraus = sc.nextInt();
        String escadaDeCaractere = escadinha.EscadaDeCaractere(degraus);
        System.out.println(escadaDeCaractere);

    }
}



