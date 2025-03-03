import taxes.IncomeTax6Percent;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ООО Рога и копыта", new TaxEarningsMinusSpendings());
        company.setDebit(100_000);
        company.setCredit(50_000);
        company.calcTax();

        company.setTaxSystem(new IncomeTax6Percent());
        company.setDebit(100_000);
        company.setCredit(50_000);
        company.calcTax();
    }
}