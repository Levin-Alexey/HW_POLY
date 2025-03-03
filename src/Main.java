import deals.Deal;
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
        IncomeTax6Percent incomeTax6Percent = new IncomeTax6Percent();
        TaxEarningsMinusSpendings taxEarningsMinusSpendings = new TaxEarningsMinusSpendings();
        System.out.println(incomeTax6Percent.calcTaxFor(100, 50));
        System.out.println(taxEarningsMinusSpendings.calcTaxFor(100, 50));
        Deal deal = new Deal("Покупка машины на 1000000 руб.", 1000000, 0);
        Deal deal2 = new Deal("Продажа машины на 1500000 руб.", 0, 1500000);
        Deal deal3 = new Deal("Покупка квартиры на 5000000 руб.", 5000000, 0);


    }
}