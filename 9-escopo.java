class Escopo{

    public static void main(String[] args){
        System.out.println("Executando projeto 9 - Escopo");

        int idadeJoao = 18;
        boolean acompanhado = true;
        String mensagem;

        if(acompanhado == true){
            mensagem = "Joao esta acompanhado";
        }else{
            mensagem = "Joao nao esta acompanhado";
        }
        
        if(idadeJoao >= 18 || acompanhado == true){
            System.out.println("Pode entrar.");
        }else{
            System.out.println("Nao pode entrar.");
        }

        System.out.println(mensagem);
    }

}