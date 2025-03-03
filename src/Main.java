import deals.Deal;
import taxes.IncomeTax6Percent;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("ООО Рога и копыта", new TaxEarningsMinusSpendings());
        Company company2 = new Company("ООО Лапти и башмаки", new IncomeTax6Percent());
        company1.shiftMoney(1000000);
        company1.shiftMoney(-500000);

        company2.shiftMoney(1000000);
        company2.shiftMoney(-500000);




        Deal deal1 = new Deal("Покупка машины на 1000000 руб.", 1000000, 0);
        Deal deal2 = new Deal("Продажа машины на 1500000 руб.", 0, 2000000);
        Deal deal3 = new Deal("Покупка квартиры на 5000000 руб.", 5000000, 0);

        Deal[] deals = {deal1, deal2, deal3};
        int balanceChange = company1.applyDeals(deals);
        System.out.println("Изменение баланса компании: " + balanceChange);


        int balanceChange2 = company2.applyDeals(deals);
        System.out.println("Изменение баланса компании: " + balanceChange2);


    }
}