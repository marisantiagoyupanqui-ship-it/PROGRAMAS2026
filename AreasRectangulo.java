public class AreasRectangulo {
    public static void main(String[] args){
    double base = 5.0;
    double Altura = 10.5;
    double area =CalcularArea(base , Altura);
    System.out.print("El Area del Rectangulo es:" + area);
}
public static double CalcularArea(double b, double h ){
    return b*h;
}
}

