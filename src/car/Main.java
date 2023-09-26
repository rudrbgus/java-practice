package car;

public class Main {
    public static void main(String[] args) {
        Car morning = new Car("모닝", 50000, false, "기아");
        System.out.println(morning.toString());
        CarView.start();
    }
}
