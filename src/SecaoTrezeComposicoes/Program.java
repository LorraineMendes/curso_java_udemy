package SecaoTrezeComposicoes;

import enums.WorkerLevelSecaoTrezeComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o nome do departamento");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data");

        System.out.println("Name:");
        String workerName = sc.nextLine();

        System.out.println("Level:");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary:");
        Double baseSalary = sc.nextDouble();

        //Instanciando um novo objeto do tipo Worker
        //Os dados desse objeto são os parametros
        // Associado ao objeto temos outro objeto do tipo departamento
        // Objeto tipo worker e objeto tipo departamento, eles esao associados entre si
        Worker worker = new Worker(workerName, WorkerLevelSecaoTrezeComposicao.valueOf(workerLevel), baseSalary, new Department((departmentName)));

        System.out.println("How many contracts to this worker ?");
        int n = sc.nextInt();

        for (int i =1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data:");

            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours)");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract); //Associando o contrato com o trabalhador
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2)); //recortando o string
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name:" + worker.getName());
        System.out.printf("Department:" + worker.getDepartment().getName()); //Composicao de objetos
        System.out.printf("Income for" + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));



        sc.close();
    }
}