package SecaoQuatorzeMetodosAbstratos;

import enums.ColorSecaoQuatorzeMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape>  list = new ArrayList<>();

        System.out.println("Enter the number of shapes:");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Shape #" +i+ " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);

            System.out.println("Color (BLACK/BLUE/RED):");
            ColorSecaoQuatorzeMetodosAbstratos color = ColorSecaoQuatorzeMetodosAbstratos.valueOf(sc.next());

            if (ch == 'r'){
                System.out.println("Width:");
                Double width = sc.nextDouble();

                System.out.println("Height");
                Double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));

            }
            else{
                System.out.println("Radious:");
                Double radious = sc.nextDouble();

                list.add(new Circle(color, radious));
            }

            System.out.println();
            System.out.println("SHAPE AREAS");
            for (Shape shape : list){
                System.out.printf("%.2f%n", shape.area());
            }

        }



        sc.close();
    }
}
