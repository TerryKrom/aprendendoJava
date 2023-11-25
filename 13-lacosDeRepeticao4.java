import java.util.Scanner;

class Looping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o numero de colunas: ");
        int colunas = sc.nextInt();

        // Primeiro loop
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Segundo loop
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                if (coluna > linha)
                    break;

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
