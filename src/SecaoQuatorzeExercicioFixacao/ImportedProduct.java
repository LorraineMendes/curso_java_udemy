package SecaoQuatorzeExercicioFixacao;

public class ImportedProduct extends  Product{
    private Double customsFee;

    public ImportedProduct () {}

    public ImportedProduct(String name, Double price, Double cusomsFee) {
        super(name, price);
        this.customsFee = cusomsFee;
    }

    public Double getCusomsFee() {
        return customsFee;
    }

    public void setCusomsFee(Double cusomsFee) {
        this.customsFee = cusomsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return getName() +
                "$" +
                String.format("%.2f", getPrice()) +
                " (Customs fee: $"+
                String.format("%.2f", customsFee)+
                ")";
    }
}
