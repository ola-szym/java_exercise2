package car;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CarCalculatorTest {

//    @Test
//    public void shouldCalculatePriceForBlackFiat() {
//        // given
//        Car car = new Car(Kolor.CZARNY,Marka.FIAT,RodzajPaliwa.BENZYNA,Skrzynia.AUTOMATYCZNA,StandardWyposazenia.BASIC);
//
//        // when
//        CarCalculator calculator = new CarCalculator();
//        int cena = calculator.calculate(car);
//
//        // then
//        assertEquals(95000, cena);
//    }
//
//    @Test
//    public void shouldCalculatePriceForWhiteSkodaWithDiesel() {
//        // given
//        Car car = new Car(Kolor.BIALY,Marka.SKODA,RodzajPaliwa.DIESEL,Skrzynia.AUTOMATYCZNA,StandardWyposazenia.BASIC);
//
//        // when
//        int cena = CarCalculator.calculate(car);
//
//        // then
//        assertEquals(93000, cena);
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void shouldNotCalculatePriceForNotBlackVip() {
//        // given
//        Car car = new Car(Kolor.BIALY,Marka.SKODA,RodzajPaliwa.DIESEL,Skrzynia.AUTOMATYCZNA,StandardWyposazenia.VIP);
//
//        // when
//        CarCalculator.calculate(car);
//    }

    //Testuje cene dla czernego AUDI wyprodukowanego 12-04-2010 (years>5)
    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate12042010(){
        //given
        Car car = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2010,4,12));

        //when
        int cena = CarCalculator.calculate(car);

        //then
        assertEquals(206400, cena);
    }

    //Testuje cene dla czernego AUDI wyprodukowanego 01-12-2016 (years<5)
    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate01122016(){
        //given
        Car car = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2016,12,1));

        //when
        int cena = CarCalculator.calculate(car);


        //then
        assertEquals(258000, cena);
    }

    @Test
    public void shouldCalculatePriceForBlackAudiWithProductionDate01122016XXXX(){
        //given
        Car car = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2016,12,1));

        //when
        int cena = car.calculate();

        //then
        assertEquals(258000, cena);
    }

    @Test
    public void shouldCalculatePriceAt_01_01_2018(){
        //given
        Car car = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2016,12,1));

        //when
        int cena = car.calculatePriceAtDate(LocalDate.of(2018,1,1));

        //then
        assertEquals(258000, cena);

    }


    @Test
    public void shouldCalculateCarsPricesFromList () {
        //given
        Car car0 = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2016,12,1));
        Car car1 = new Car(Kolor.CZARNY, Marka.SKODA, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2013,4,15));

        List<Car> cars = new ArrayList<>();
        cars.add(car0);
        cars.add(car1);

        //when
        int cena = CarCalculator.calculateCarsPrices(cars);

        //then
        assertEquals(368400,cena);
    }
}