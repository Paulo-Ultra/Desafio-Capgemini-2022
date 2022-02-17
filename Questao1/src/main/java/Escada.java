public class Escada {

    public String EscadaDeCaractere(int contVaz) {
        StringBuilder escada = new StringBuilder();
        String asterisco = "*";
        String vazio = " ";

        for (int contAst = 1; contAst <= contVaz; contAst++) { //contador para verificação e para produzir a escada
            int numeroDeEspaco = contVaz - contAst; //O número digitado será a referência a variável que vai passar os espaços que sobraram para variável String
            String espacosvazios = vazio.repeat(numeroDeEspaco); //Que por sua vez vai completar com "vazio" o número de espaços que o asterisco(contAst) não completou
            String asteriscos = asterisco.repeat(contAst); // No escopo os astericos serão repetidos da contagem
            escada.append(espacosvazios).append(asteriscos).append("\n"); //Método para adicionar a "escada" a cada linha formatado pelo salto da linha "\n"
        }
        return escada.toString(); //Retorna String que representa o objeto que está chamou o método
    }
}


