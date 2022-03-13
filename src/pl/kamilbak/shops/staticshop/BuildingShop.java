package pl.kamilbak.shops.staticshop;

public class BuildingShop extends AbstractStaticShop {

    private int numerOfRefrigerator;


    public BuildingShop(String name, String address) {
        super(name, address);
    }

    public int getNumerOfRefrigerator() {
        return numerOfRefrigerator;
    }

    public void setNumerOfRefrigerator(int numerOfRefrigerator) {
        this.numerOfRefrigerator = numerOfRefrigerator;
    }
}
