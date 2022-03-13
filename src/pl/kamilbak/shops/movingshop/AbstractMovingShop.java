package pl.kamilbak.shops.movingshop;

import pl.kamilbak.shops.AbstractShop;
import pl.kamilbak.shops.ShopType;

public abstract class AbstractMovingShop extends AbstractShop implements MovingShop {

    protected AbstractMovingShop(String name)
    {
        super(name);
    }

    @Override
    public ShopType getType() {
        return ShopType.MOVING;
    }



}
