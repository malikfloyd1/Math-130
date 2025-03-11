import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c; 

        System.out.println("Coefficient a:" + a);
        a = input.nextDouble();
        System.out.println("Coefficient b: " + b);
        b = input.nextDouble();
        System.out.println("Constant c: " + c);
        c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
           double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are root1 = %.2f and root2 = %.2f");
        }
        else if(discriminant == 0){
            double root = (-b / (2 * a));
            System.out.println("The root is: " + root);

        }
      else {
        System.out.println("The equation has no real roots.")

        }
        }
}
