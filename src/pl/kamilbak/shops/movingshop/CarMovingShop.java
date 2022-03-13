package pl.kamilbak.shops.movingshop;

public class CarMovingShop extends AbstractMovingShop{
    private String carPlate;

    public CarMovingShop(String name, String carPlate)
    {
        super(name);
        this.carPlate = carPlate;
    }

    @Override
    public void changeCar( String newPlate ) {
        carPlate = newPlate;
    }

    public String getCarPlate() {
        return carPlate;
    }
}
