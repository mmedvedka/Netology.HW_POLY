public class Deal {
    protected String comment;
    protected int debitChange;
    protected int creditChange;

    public int getDebitChange (){
        return debitChange;
    }

    public int getCreditChange (){
        return creditChange;
    }

    public Deal(String comment, int creditChange, int debitChange){
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }
}
