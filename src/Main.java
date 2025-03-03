import taxes.IncomeTax6Percent;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("ООО Рога и копыта", new TaxEarningsMinusSpendings());
        Company company2 = new Company("ООО Лапти и башмаки", new IncomeTax6Percent());
        company1.shiftMoney(1000000);
        company1.shiftMoney(-500000);
        company1.calcTax();
        company2.shiftMoney(1000000);
        company2.shiftMoney(-500000);
        company2.calcTax();
    }
}