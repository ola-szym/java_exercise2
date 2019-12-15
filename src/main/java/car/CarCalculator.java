package car;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CarCalculator {


    public static void main(String[] args) {

        //tworze samochod z data produkcji 12-04-2010
        Car car0 = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP, LocalDate.of(2010,4,12));
        int cena0 = calculate(car0);
        System.out.println(cena0);

        Car car1 = new Car(Kolor.CZERWONY, Marka.FIAT, RodzajPaliwa.BENZYNA, Skrzynia.MANUALNA, StandardWyposazenia.PREMIUM,LocalDate.of(2015,1,13));
        int cena1 = calculate(car1);
        System.out.println(cena1);

        Car car2 = new Car(Kolor.CZERWONY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.PREMIUM,LocalDate.of(1998,6,22));
        int cena2 = calculate(car2);
        System.out.println(cena2);

        Car car3 = new Car(Kolor.CZERWONY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.PREMIUM,LocalDate.of(2008,2,3));
        int cena3 = calculate(car3);
        System.out.println(cena3);


        Car car4 = new Car(Kolor.CZARNY, Marka.AUDI, RodzajPaliwa.DIESEL, Skrzynia.MANUALNA, StandardWyposazenia.VIP,LocalDate.of(2017,11,28));
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

        System.out.println("Suma cen podanych samochodow wynosi: " + sum);
    }

    public static int calculateCarsPrices(List<Car> cars){
        int cena=0;
        for (Car car : cars){
            cena+=calculate(car);
        }
        return cena;
    }


    public static int calculate(Car car) {
        if (car.getWyposazenie() == StandardWyposazenia.VIP && car.getKolor() != Kolor.CZARNY) {
            throw new IllegalStateException("VIP moze byc tylko czarny");
        }

        if (car.getMarka() == Marka.FIAT && car.getPaliwo() == RodzajPaliwa.DIESEL) {
            throw new IllegalStateException("Nie ma fiata w wersji diesel");
        }

        if (car.getMarka() == Marka.AUDI && car.getWyposazenie() == StandardWyposazenia.BASIC) {
            throw new IllegalStateException("Audi jest tylko w standardzie VIP i premium");
        }

        int cena = 0;

        cena += car.getMarka().getWartosc();
        cena += car.getKolor().getWartosc();
        cena += car.getPaliwo().getWartosc();
        cena += car.getSkrzynia().getWartosc();
        cena += car.getWyposazenie().getWartosc();

        if (car.getKolor() == Kolor.CZERWONY && car.getWyposazenie() == StandardWyposazenia.PREMIUM) {
            cena += 3000;
        }

        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(car.getDataProdukcji(),today);
        if (years>5){
            cena-=0.2*cena;
        }

        return cena;
    }

}