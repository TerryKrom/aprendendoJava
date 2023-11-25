import java.util.Scanner;

class floatPoint{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Executando projeto 3 - Criando variaveis ponto flutuante");


        System.out.print("Digite um valor de salario: R$");
        
        double salario = sc.nextDouble();
        System.out.println(salario);

        double idade;
        idade = 15 / 2.0;
        System.out.println(idade);

        idade = 5 / 3;
        System.out.println("5 / 3 = " + idade);

        idade = 5.0 / 3;
        System.out.println("5.0 / 3 = " + idade);

    }

}