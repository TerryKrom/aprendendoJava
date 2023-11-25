import java.util.Scanner;

class Condicionais{

    public static void main(String[] args){
        System.out.println("Executando projeto 7 - Condicionais");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a quantidade de pessoas: ");
        int qtdPessoas = sc.nextInt();

        if(idade >= 18){
            System.out.print("Possui mais de 18 anos. Pode entrar!");
        }else{
            if(qtdPessoas >= 2){
                System.out.println("Nao possui mais de 18 anos, mas está acompanhado. Pode entrar!");
            }else{
                System.out.println("Não possui mais de 18 anos, não pode entrar!");
            }
        }
        sc.close();
    }

}