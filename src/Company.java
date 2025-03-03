import deals.Deal;
import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public String getTitle() {
        return title;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void calcTax() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {

        for (Deal d : deals) {

            debit += d.getDebitChange();
            credit += d.getCreditChange();
        }

        int difference = debit - credit;

        calcTax();

        return difference;
    }

}
