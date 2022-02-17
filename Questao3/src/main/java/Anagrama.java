import java.util.ArrayList;
import java.util.Arrays;

public class Anagrama {

    /**Método responsável pelo retorno da quantidade de anagramas em um Array de Strings.
     *
     * @param numAnag ArrayList<String> - Array contendo todas as Substrings.
     * @return int - Número de anagramas.
     * A palavra usada como referência no teste e debug foi: "ifailuhkqq"
     */
    public static int NumAnagramas(ArrayList<String> numAnag) {
        int cont = 0; // contador de anagramas
        for (int i = 0; i < numAnag.size() - 1; i++) { // index para percorrer o tamanho da palavra digitada
            for (int j = i + 1; j < numAnag.size(); j++) { // index para contra correr o tamanho da palavra digitada com o acréscimo de um a mais
                char[] temp1 = numAnag.get(i).toCharArray(); //Começa a mostrar o 1º valor (String) do array
                // Exemplo da primeira contagem do index: Puxa String [i]
                char[] temp2 = numAnag.get(j).toCharArray(); //Mostra dois valores (String) do array
                // Exemplo da primeira contagem do index: Puxa String [i, f]
                // Exemplo da segunda contagem do index: Puxa String [i, f, a] até percorrer todas as strings do index j e começar a mudar a String do index i e repetir as do index j
                //E por fim percorrer em ambos os indexes

                Arrays.sort(temp1); //Método para ordenar os elementos do array
                Arrays.sort(temp2); //Método para ordenar os elementos do array

                if(Arrays.equals(temp1, temp2)) { //Condicional para verificar as Strings iguais
                    cont++; // Conta os anagramas;
                }
            }
        }
        return cont;
    }
    /**Método responsável pelo retorno de todas as substrings contidas em uma string.
     *
     * @param str String - String a ser verificada.
     * @return letrAnag - ArrayList contendo todas as Substrings da string em questão.
     */
    public static ArrayList<String> LetrasAnagramas (String str) {
        ArrayList<String> letrAnag = new ArrayList<>(); // A palavra "ifailuhkqq" terá 55 elementos dentro do array com o elemento 0 = "i" e o elemento 54 = "q"
        for (int i = 0; i < str.length(); i++) { //Assim como antes os index percorrem o array e suas Strings
            for (int j = i + 1; j <= str.length(); j++) {
                letrAnag.add(str.substring(i, j)); //O método vai pegando as partes dos Strings e adicionando as saídas dos arrays por meio dos indexes
            }
        }
        return letrAnag;
    }
}
