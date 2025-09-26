import taxes.TaxSystem;
import taxes.TaxSystem_USN;
import taxes.TaxSystem_USN_Minus_Credit;

public class Main {
    public static void main(String[] args) {
        TaxSystem_USN taxSystem_1 = new TaxSystem_USN();
        Company company = new Company("Аркадия", taxSystem_1);
        Deal[] deals = {
            new Sale("Сковорода", 1000),
            new Expenditure("Кастрюля", 500),
            new Sale("Тарелка", 1500),
            new Expenditure("Чашка", 250),
            new Sale("Нож", 750),
            new Expenditure("Салатница", 300)
        };

        System.out.println("Товары:");
        for (Deal deal : deals) {
            System.out.println(deal.toString());
        };

        System.out.println();
        System.out.println("УСН доходы — налог 6% от доходов:");
        System.out.println("Разница доходов и расходов: " + company.applyDeals(deals));

        TaxSystem_USN_Minus_Credit taxSystem_2 = new TaxSystem_USN_Minus_Credit();
        System.out.println();
        company.setTaxSystem(taxSystem_2);
        System.out.println("УСН доходы минус расходы — налог 15% от разницы доходов и расходов:");
        System.out.println("Разница доходов и расходов: " + company.applyDeals(deals));
    }
}