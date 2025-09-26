public class Expenditure  extends Deal{
    public Expenditure (String comment, int creditChange){
        super(comment, 0, 0);
        this.debitChange = 0;
        this.creditChange = creditChange;
    }

    public String toString(){
        return String.format("Покупка <%s> на <%d>", comment, creditChange);
    }
}
