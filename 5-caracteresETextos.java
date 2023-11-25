class Caracteres {

    public static void main(String[] args) {
        System.out.println("Executando projeto 5 - Caracteres e Texto");

        char primeiraLetra = 'A';
        System.out.println(primeiraLetra);

        primeiraLetra = (char)50;
        System.out.println(primeiraLetra);

        primeiraLetra = (char)(primeiraLetra + 1);
        System.out.println(primeiraLetra);

        String titulo = "Java is Awesome since " + 1991;

        String linguagens = 
            "- Python\n" +
            "- JavaScript\n" +
            "- Java";

        System.out.println(titulo);
        System.out.println(linguagens);
    }

}
