package pl.kamilbak.shops.staticshop;

public class MarketShop extends AbstractStaticShop {

    private int numberOfStands;


    public MarketShop(String name, String address, int numberOfStands) {
        super(name,address );
        this.numberOfStands = numberOfStands;
    }

    public int getNumberOfStands() {
        return numberOfStands;
    }

    public void setNumberOfStands(int numberOfStands) {
        this.numberOfStands = numberOfStands;
    }
}
