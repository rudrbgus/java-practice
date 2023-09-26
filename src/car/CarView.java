package car;

import java.util.Scanner;

public class CarView {
    static Scanner sc = new Scanner(System.in);
    public static void viewMenu(){
        System.out.println("# 1. 자동차 정보 넣기");
        System.out.println("# 2. 자동차 정보 보기");
    }

    public static void selectMenu(int selectNum){
        switch (selectNum){
            case 1:
                createNewCar();
                break;
            case 2:
                searchCarInfo();
                break;
            default:
                break;
        }
    }

    public static void createNewCar(){
        Car car;
        System.out.println("자동차 이름: ");
        String carName=sc.nextLine();
        System.out.println("자동차 가격: ");
        int carPrice=Integer.parseInt(sc.nextLine());
//        System.out.println("자동차 종류: ");
//        carType carType=(carType) sc.nextLine();
        System.out.println("전기차 인가요?(Y/N): ");
        String isElectronic=sc.nextLine();
        boolean isElec = isElectronic.toUpperCase().equals('Y') ? true: false;
        System.out.println("자동차 브랜드");
        String carBrand = sc.nextLine();
        car = new Car(carName, carPrice, isElec, carBrand);
        CarList.allCar.add(car);
    }
    public static void searchCarInfo(){
        for (int i = 0; i < CarList.allCar.size(); i++) {
            CarList.allCar.iterator().next();
        }

    }

    public static void start(){
        while(true){
            viewMenu();
            int input = sc.nextInt();
            selectMenu(input);
        }
    }


}
