import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes:");
        int n = sc.nextInt();
        sc.nextLine();

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle or circle?");
            char enteredChar = sc.nextLine().charAt(0);

            if (enteredChar == 'r') {
                System.out.println("Enter color (BLACK, BLUE, RED):");
                Color color = Color.valueOf(sc.nextLine().toUpperCase());
                System.out.println("Enter width:");
                double width = sc.nextDouble();
                System.out.println("Enter height:");
                double height = sc.nextDouble();
                sc.nextLine();
                list.add(new Rectangle(color, width, height));
            } else if (enteredChar == 'c') {
                System.out.println("Enter color (BLACK, BLUE, RED):");
                Color color = Color.valueOf(sc.nextLine().toUpperCase());
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                sc.nextLine();
                list.add(new Circle(color, radius));
            } else {
                System.out.println("Invalid input. Please enter 'r' for rectangle or 'c' for circle.");
                i--;
            }
        }

        for (Shape area : list) {
            area.area();
        }

        sc.close();
    }
}
