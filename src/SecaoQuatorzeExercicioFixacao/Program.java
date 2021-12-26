package SecaoQuatorzeExercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main (String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);
            System.out.println();

            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Price:");
            Double price = sc.nextDouble();

            if (type == 'c'){
                Product product = new Product(name, price);
                list.add(product);
            }
            else if(type == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY):");
                Date date = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            }

            else{
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
