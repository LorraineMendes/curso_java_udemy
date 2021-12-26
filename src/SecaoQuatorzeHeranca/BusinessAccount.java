package SecaoQuatorzeHeranca;

public class BusinessAccount  extends Account{
    private Double loanlimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan (double amount){
        if (amount <= loanlimit){
            balance += amount - 10;
        }
    }

    @Override //reutilizando o codigo da super classe
    public void withdraw (double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
