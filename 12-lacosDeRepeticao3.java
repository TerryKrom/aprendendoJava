import java.util.Scanner;

class Looping{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para verificar a tabuada: ");
        int number = sc.nextInt();

        for(int contador = 0; contador <= 10; ++contador){
            System.out.println(number + "x" + contador + "=" + number*contador);
        }

    }

}