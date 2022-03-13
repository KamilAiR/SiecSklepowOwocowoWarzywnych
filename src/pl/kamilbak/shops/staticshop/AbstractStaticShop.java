package pl.kamilbak.shops.staticshop;

import pl.kamilbak.shops.AbstractShop;
import pl.kamilbak.shops.ShopType;

public abstract class AbstractStaticShop extends AbstractShop {

    protected String address;


    protected AbstractStaticShop(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public ShopType getType() {
        return ShopType.STATIC;
    }

    public void changeAddress ( String newAddress)
    {
        address = newAddress;
    }

}
