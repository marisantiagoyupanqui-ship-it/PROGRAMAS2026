public class NumersPromedio {
    public static void main(String[] args){
        int[]numeros={15,18,12,20,16};
        int suma = 0;
        for(int i=0;i<numeros.length;i++){
            suma+=numeros[i];
        }
        double promedio=(double)suma/numeros.length;
        System.out.println("El Promedio es:"+promedio);
    }
}


