import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = input.nextInt();
        System.out.print("Enter second side: ");
        int b = input.nextInt();
        System.out.print("Enter third side: ");
        int c = input.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
      //  } else if (a == b && b == c) {
       //     System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else if ((a * a + b * b > c * c) && (a * a + c * c > b * b) && (b * b + c * c > a * a)) {
            System.out.println("Acute Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        input.close();
    }
}
