package car;

import java.util.ArrayList;

public class CarBrandList {
    private String carBrand;
    private ArrayList<Car> carList = new ArrayList<Car>(){};

    public CarBrandList(String carBrand) {
        this.carBrand = carBrand;
    }
}
