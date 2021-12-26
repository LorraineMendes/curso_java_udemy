package SecaoQuatorzeHeranca;

public class Program {

    public static void main (String[] args){
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Lorraine", 0.0, 800.0);
        Account acc3 = new SavingsAccount(1004, "Bia", 0.0, 0.05);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);


        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof  BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Emprestimo");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        Account acc6 = new Account(1006, "Ana", 1000.0);
        acc6.withdraw(200.00);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1007, "Andre", 1000.0, 0.06);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance()); // Vemos que a sobreposicao esta funcionando pois nao tem o desconto de 5 reais

        Account acc8 = new BusinessAccount(1008, "Cirlei", 1000.0, 500.0); //Aproveitando a logica da superclassee
        acc8.withdraw(200.00);
        System.out.println(acc8.getBalance());

        // Aqui nessas variaveis acontece o polimosrfismo, pois as variaveis acc sao de um mesmo tipo, porem os objetos para os quais elas apontam sao de tipos diferentes
        //Entao o metodo withdraw utilizado acontece de formas diferentes em casa um desses obj

    }
}
