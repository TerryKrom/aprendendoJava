import java.util.Scanner;

class Condicionais2 {

    public static void main(String[] args) {
        System.out.println("Executando projeto 7 - Condicionais");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Esta acompanhado? [Y/N] ");
        String acompanhado = sc.nextLine();

        if (idade >= 18 && acompanhado.equalsIgnoreCase("Y")) {
            System.out.println("Pode entrar.");
        } else {
            System.out.println("Nao pode entrar.");
        }

        sc.close();
    }

}
