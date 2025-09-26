import taxes.TaxSystem;
import taxes.TaxSystem_USN;
import taxes.TaxSystem_USN_Minus_Credit;

public class Main {
    public static void main(String[] args) {
        TaxSystem_USN taxSystem_1 = new TaxSystem_USN();
        TaxSystem_USN_Minus_Credit taxSystem_2 = new TaxSystem_USN_Minus_Credit();
        Company company = new Company("Аркадия", taxSystem_1);
        company.shiftMoney(5000);
        company.shiftMoney(-1000);
        company.shiftMoney(500);
        company.payTaxes();
        company.shiftMoney(105000);
        company.shiftMoney(-15000);
        company.shiftMoney(1000);
        company.payTaxes();

        Company company_1 = new Company("СИДАТА", taxSystem_1);
        company_1.shiftMoney(-5000);
        company_1.shiftMoney(1000);
        company_1.shiftMoney(500);
        company_1.payTaxes();
        company_1.shiftMoney(10000);
        company_1.shiftMoney(-15000);
        company_1.shiftMoney(1000);
        company_1.payTaxes();
        
        company.setTaxSystem(taxSystem_2);
        company.shiftMoney(5000);
        company.shiftMoney(-5000);
        company.shiftMoney(500);
        company.payTaxes();
        company.shiftMoney(10000);
        company.shiftMoney(-15000);
        company.shiftMoney(1000);
        company.payTaxes();

        company_1.setTaxSystem(taxSystem_2);
        company_1.shiftMoney(-5000);
        company_1.shiftMoney(5000);
        company_1.shiftMoney(500);
        company_1.payTaxes();
        company_1.shiftMoney(10000);
        company_1.shiftMoney(-15000);
        company_1.shiftMoney(1000);
        company_1.payTaxes();
    }
}