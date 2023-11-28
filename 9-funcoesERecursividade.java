class Escopo{

    public static void main(String[] args){
            int result = resultInt(0);
            System.out.println(result);
        }
    
    public static String resultString(String name){
        String result = "A sua variavel e: " + name + "e o tamanho de caracteres e: " + name.length();
        return result;
    }

    public static int resultInt(int numberBox){

        if(numberBox <= 5){
            System.out.println(numberBox);
            return resultInt(++numberBox);
        }else{
            return numberBox;
        }

    }

}