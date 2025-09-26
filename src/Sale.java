public class Sale extends Deal{

    public Sale (String comment, int debitChange){
        super(comment, 0, 0);
        this.debitChange = debitChange;
        this.creditChange = 0;
    }

    public String toString(){
        return String.format("Продажа <%s> на <%d> руб.", comment, debitChange);
    }

}
