import java.util.Scanner;

public class AreaCalculator {

    public static int area (int side){
        return side*side;
    }
    public static int area (int lenght, int height){
        return lenght*height;
    }
    public static double area (double radius){
        return 3.14*radius*radius;
    }
    public static String area(int side, int lenght, int height, double radius){
        return "A area do quadrado é " + area(side) + "\nA área do rectangulo é " + area(lenght, height) + "\nA área do circulo é " + area(radius);
    }
    public static void main(String[] args) {
        
        int side, lenght, height;
        double radius;

        Scanner sc = new Scanner (System.in);

        System.out.println("Qual o tamanho do lado do quadrado?");
        side = sc.nextInt();
        System.out.println("Qual o tamanho do lado do retangulo?");
        lenght = sc.nextInt();
        System.out.println("Qual o tamanho da altura do retangulo?");
        height = sc.nextInt();
        System.out.println("Qual o tamanho do raio do circulo?");
        radius = sc.nextDouble();
        sc.close();

        String s = area(side, lenght, height, radius);

        System.out.println(s);
}
}
