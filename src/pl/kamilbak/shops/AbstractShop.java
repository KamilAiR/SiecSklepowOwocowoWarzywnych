package pl.kamilbak.shops;

public abstract class AbstractShop implements  Shop {
    protected String name;
    protected int monthlyIncome = 0;

    protected AbstractShop( String name)
    {
        this.name =name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
