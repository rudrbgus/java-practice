package car;

public class Car {
    private String carName; // 자동차 이름
    private int carPrice; // 자동차 가격
    private carType carType; // 자동차 종류 (세단 , SUV, 쿠페, )
    private boolean isElectronic;
    private String carBrand;


    public Car(String carName, int carPrice, car.carType carType, boolean isElectronic, String carBrand) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carType = carType;
        this.isElectronic = isElectronic;
        this.carBrand = carBrand;
    }

    public Car(String carName, int carPrice, boolean isElectronic, String carBrand) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.isElectronic = isElectronic;
        this.carBrand = carBrand;
    }

    public car.carType getCarType() {
        return carType;
    }

    public void setCarType(car.carType carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    public void setElectronic(boolean electronic) {
        isElectronic = electronic;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carType=" + carType +
                ", isElectronic=" + isElectronic +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
