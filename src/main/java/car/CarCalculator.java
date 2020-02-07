package car;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CarCalculator {


    public static void main(String[] args) {

        Car car0 = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2010,4,12));
        int price0 = calculate(car0);
        System.out.println(price0);

        Car car1 = new Car(Color.RED, Brand.FIAT, FuelType.PETROL, GearBoxType.MANUAL, EquipmentStandard.PREMIUM,LocalDate.of(2015,1,13));
        int price1 = calculate(car1);
        System.out.println(price1);

        Car car2 = new Car(Color.RED, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.PREMIUM,LocalDate.of(1998,6,22));
        int price2 = calculate(car2);
        System.out.println(price2);

        Car car3 = new Car(Color.RED, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.PREMIUM,LocalDate.of(2008,2,3));
        int price3 = calculate(car3);
        System.out.println(price3);

        Car car4 = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP,LocalDate.of(2017,11,28));
        calculate(car4);

        // -----------------

        int sum = 0;

        List<Car> cars = new ArrayList<>();
        cars.add(car0);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for (Car element : cars) {
            sum = sum + calculate(element);
        }

        System.out.println("The sum of cars prices: " + sum);
    }

    public static int calculateCarsPrices(List<Car> cars){
        int price=0;
        for (Car car : cars){
            price+=calculate(car);
        }
        return price;
    }


    public static int calculate(Car car) {
        if (car.getEquipmentStandard() == EquipmentStandard.VIP && car.getColor() != Color.BLACK) {
            throw new IllegalStateException("VIP might be only black");
        }

        if (car.getBrand() == Brand.FIAT && car.getFuelType() == FuelType.DIESEL) {
            throw new IllegalStateException("There is no Fiat with Diesel");
        }

        if (car.getBrand() == Brand.AUDI && car.getEquipmentStandard() == EquipmentStandard.BASIC) {
            throw new IllegalStateException("Audi is only in VIP and premium standard");
        }

        int price = 0;

        price += car.getBrand().getValue();
        price += car.getColor().getValue();
        price += car.getFuelType().getValue();
        price += car.getGearBoxType().getValue();
        price += car.getEquipmentStandard().getValue();

        if (car.getColor() == Color.RED && car.getEquipmentStandard() == EquipmentStandard.PREMIUM) {
            price += 3000;
        }

        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(car.getProductionDate(),today);
        if (years>5){
            price-=0.2*price;
        }

        return price;
    }

}