public class Trabajo {

    public static void main(String[] args){
        System.out.println("Numeros Pares Del 1 al 20;");
        for(int i = 1;i<=20;i++){
            if(i % 2!=0){
                continue;
            }
            System.out.println(i+"");
        }
    }
}
