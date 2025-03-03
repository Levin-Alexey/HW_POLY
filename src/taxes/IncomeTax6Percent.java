package taxes;

public class IncomeTax6Percent extends TaxSystem{

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) * 6 / 100;
    }
}
