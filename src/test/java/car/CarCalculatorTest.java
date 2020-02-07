package car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarCalculatorTest {

    @Test
    public void shouldCalculatePriceForBlackFiat() {
        // given
        Car car = new Car(Color.BLACK,Brand.FIAT,FuelType.PETROL,GearBoxType.AUTOMATIC,EquipmentStandard.BASIC, LocalDate.of(2012,4, 2));

        // when
        CarCalculator calculator = new CarCalculator();
        int price = calculator.calculate(car);

        // then
        assertEquals(95000, price);
    }

    @Test
    public void shouldCalculatePriceForWhiteSkodaWithDiesel() {
        // given
        Car car = new Car(Color.WHITE,Brand.SKODA,FuelType.DIESEL,GearBoxType.AUTOMATIC,EquipmentStandard.BASIC, LocalDate.of(1998, 11, 7));

        // when
        int price = CarCalculator.calculate(car);

        // then
        assertEquals(93000, price);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotCalculatePriceForNotBlackVip() {
        // given
        Car car = new Car(Color.WHITE,Brand.SKODA,FuelType.DIESEL,GearBoxType.AUTOMATIC,EquipmentStandard.VIP, LocalDate.of(2002, 1,19));

        // when
        CarCalculator.calculate(car);
    }

    //Testing price for black AUDI with production date 12-04-2010 (years>5)
    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate12042010(){
        //given
        Car car = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2010,4,12));

        //when
        int price = CarCalculator.calculate(car);

        //then
        assertEquals(206400, price);
    }

    //Testing price for black AUDI with production date 01-12-2016 (years<5)
    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate01122016(){
        //given
        Car car = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2016,12,1));

        //when
        int price = CarCalculator.calculate(car);


        //then
        assertEquals(258000, price);
    }

    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate01122016XXXX(){
        //given
        Car car = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2016,12,1));

        //when
        int price = car.calculate();

        //then
        assertEquals(258000, price);
    }

    @Test
    public void shouldCalculatePriceAt_01_01_2018(){
        //given
        Car car = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2016,12,1));

        //when
        int priceAtDate = car.calculatePriceAtDate(LocalDate.of(2018,1,1));

        //then
        assertEquals(258000, priceAtDate);

    }


    @Test
    public void shouldCalculateCarsPricesFromList () {
        //given
        Car car0 = new Car(Color.BLACK, Brand.AUDI, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2016,12,1));
        Car car1 = new Car(Color.BLACK, Brand.SKODA, FuelType.DIESEL, GearBoxType.MANUAL, EquipmentStandard.VIP, LocalDate.of(2013,4,15));

        List<Car> cars = new ArrayList<>();
        cars.add(car0);
        cars.add(car1);

        //when
        int price = CarCalculator.calculateCarsPrices(cars);

        //then
        assertEquals(368400,price);
    }
}