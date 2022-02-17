public class Password {

        public boolean isValidPassword(String password) {
            String message = ""; //Funciona como uma espécie mensageiro caso a senha digitada esteja faltando algum tipo de caractere

            String letrasMai = "(.*)[A-Z](.*)"; //regex
            String letrasMin = "(.*)[a-z](.*)";
            String espCaract = "(.*)[!@#$%^&()+-](.*)";
            String numCaract = "(.*)[0-9](.*)";

            if (password.length() < 6 ) // verifica o tamanho mínimo da senha
                message += "- sua senha tem apenas " + password.length() +" digitos, e o minimo é 6.\n- falta pelo menos ";

            if (!password.matches(letrasMai)) //Verifica se há letra maiúscula
                message += "> uma letra maiúscula ";

            if (!password.matches(letrasMin)) // Verifica se há letra minúscula
                message += "> uma letra minúscula ";

            if (!password.matches(espCaract)) // Verifica se há caracter especial
                message += "> um carácter especial ";

            if (!password.matches(numCaract)) //Verifica se há número
                message += "> um número";

            System.out.println(message); //Imprime o que está faltando na senha caso falte
            System.out.println();

            return message.isEmpty(); //Se der true valida a senha no método "isValid", caso false envia a mensagem do que falta e entra no loop do while para colocar nova senha
        }
    }

