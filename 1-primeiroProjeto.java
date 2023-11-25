import java.util.Scanner;

class helloWorld{
    
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Fim da execucao. Tecle [enter] para finalizar");
        sc.nextLine();
        sc.close();
    }


}