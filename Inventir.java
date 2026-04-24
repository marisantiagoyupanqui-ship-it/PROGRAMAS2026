public class Inventir {
    public static void main(String[] args){
        int[] numeros = {10 , 20, 30 , 40 , 50};
        System.out.println("Arreglo original");
        mostrarArreglo(numeros);
        inventir(numeros);
        System.out.println("Arreglo Invertido;");
        mostrarArreglo(numeros);
    }
    public static void inventir(int[] arr){
        int inicio = 0;
        int fin =arr.length - 1;
        while (inicio < fin){
            int temp = arr[inicio];
            arr[inicio]= arr[fin];
            arr[fin]=temp;
            inicio++;
            fin--;
        }
    }
    public static void mostrarArreglo(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
}

