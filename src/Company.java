import taxes.TaxSystem;

public class Company {
    private String title;
    private TaxSystem taxSystem;
    private int debit = 0;
    private int credit = 0;

    public Company(String title, TaxSystem taxSystem){
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount){
        if (amount > 0){
            debit += amount;
        }
        else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem (TaxSystem value) {
        this.taxSystem = value;
    }

    public void payTaxes(){
        int sumTaxes = taxSystem.calcTaxFor(debit, credit);
        System.out.println(String.format("Компания <%s> уплатила налог в размере: <%d> руб.", title, sumTaxes));
        debit = 0;
        credit = 0;
    }
}
