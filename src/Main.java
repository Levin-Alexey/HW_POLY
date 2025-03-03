import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.IncomeTax6Percent;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("ООО Ромашка", new IncomeTax6Percent());

        company.shiftMoney(1000);

        company.shiftMoney(-200);


        company.calcTax();


        company.setTaxSystem(new TaxEarningsMinusSpendings());

        company.shiftMoney(5000);
        company.shiftMoney(-1000);

        // Оплатим налоги снова
        company.calcTax();

        System.out.println("=========================================================");


        Company company2 = new Company("ООО Василёк", new IncomeTax6Percent());


        Deal[] deals = {
                new Sale("Телефон", 3000),        // доход +3000
                new Expenditure("Комплектующие", 500), // расход +500
                new Sale("Ноутбук", 7000),       // доход +7000
                new Expenditure("Офисная мебель", 2000) // расход +2000
        };


        int differenceBeforeTax = company2.applyDeals(deals);

        System.out.println("Разница доходов и расходов до уплаты налога: " + differenceBeforeTax + " руб.");
    }
}