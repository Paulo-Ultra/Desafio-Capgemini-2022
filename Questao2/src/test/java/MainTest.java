import java.util.Scanner;


    public class MainTest {
        public static void main(String[] args) {
            boolean isValid = false;
            Scanner sc = new Scanner(System.in);

            Password password = new Password();

            while(!isValid){
                System.out.println("Digite a senha para ser validada: ");
                String typedPassword = sc.next();

                isValid = password.isValidPassword(typedPassword); //Se true senha válida, caso false retorna para reescrever a senha no looping
            }
            System.out.println("PARABÉNS senha valida!");
        }
    }

