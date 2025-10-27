import java.util.Scanner;
public class TesteTriangulo {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Triangulo x, y;
       x = new Triangulo();
       y = new Triangulo();




       System.out.println("Lado a: ");
       x.A = sc.nextDouble();
       System.out.println("Lado b: ");
       x.B = sc.nextDouble();
       System.out.println("Lado c: ");
       x.C = sc.nextDouble();


       System.out.println("Area X = " + x.calcularArea());


       System.out.println("Lado a: ");
       y.A = sc.nextDouble();
       System.out.println("Lado b: ");
       y.B = sc.nextDouble();
       System.out.println("Lado c: ");
       y.C = sc.nextDouble();


       System.out.println("Area Y = " + y.calcularArea());
   }
}
