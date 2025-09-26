package taxes;

public class TaxSystem_USN_Minus_Credit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max((debit - credit) * 15 / 100, 0);
    }

}
