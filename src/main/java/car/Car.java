package car;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car {

    private Kolor kolor;
    private Marka marka;
    private RodzajPaliwa paliwo;
    private Skrzynia skrzynia;
    private StandardWyposazenia wyposazenie;
    private LocalDate dataProdukcji;


    Car(Kolor kolor, Marka marka, RodzajPaliwa paliwo, Skrzynia skrzynia, StandardWyposazenia wyposazenie, LocalDate dataProdukcji) {
        this.kolor = kolor;
        this.marka = marka;
        this.paliwo = paliwo;
        this.skrzynia = skrzynia;
        this.wyposazenie = wyposazenie;
        this.dataProdukcji = dataProdukcji;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Marka getMarka() {
        return marka;
    }

    public RodzajPaliwa getPaliwo() {
        return paliwo;
    }

    public Skrzynia getSkrzynia() {
        return skrzynia;
    }

    public StandardWyposazenia getWyposazenie() {
        return wyposazenie;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public int calculate() {
        if (wyposazenie == StandardWyposazenia.VIP && kolor != Kolor.CZARNY) {
            throw new IllegalStateException("VIP moze byc tylko czarny");
        }

        if (marka == Marka.FIAT && paliwo == RodzajPaliwa.DIESEL) {
            throw new IllegalStateException("Nie ma fiata w wersji diesel");
        }

        if (marka == Marka.AUDI && wyposazenie == StandardWyposazenia.BASIC) {
            throw new IllegalStateException("Audi jest tylko w standardzie VIP i premium");
        }

        int cena = 0;

        cena += marka.getWartosc();
        cena += kolor.getWartosc();
        cena += paliwo.getWartosc();
        cena += skrzynia.getWartosc();
        cena += wyposazenie.getWartosc();

        if (kolor == Kolor.CZERWONY && wyposazenie == StandardWyposazenia.PREMIUM) {
            cena += 3000;
        }

        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(dataProdukcji, today);
        if (years > 5) {
            cena -= 0.2 * cena;
        }
        return cena;
    }

    public int calculatePriceAtDate(LocalDate data) {
        if (wyposazenie == StandardWyposazenia.VIP && kolor != Kolor.CZARNY) {
            throw new IllegalStateException("VIP moze byc tylko czarny");
        }

        if (marka == Marka.FIAT && paliwo == RodzajPaliwa.DIESEL) {
            throw new IllegalStateException("Nie ma fiata w wersji diesel");
        }

        if (marka == Marka.AUDI && wyposazenie == StandardWyposazenia.BASIC) {
            throw new IllegalStateException("Audi jest tylko w standardzie VIP i premium");
        }

        int cena = 0;

        cena += marka.getWartosc();
        cena += kolor.getWartosc();
        cena += paliwo.getWartosc();
        cena += skrzynia.getWartosc();
        cena += wyposazenie.getWartosc();

        if (kolor == Kolor.CZERWONY && wyposazenie == StandardWyposazenia.PREMIUM) {
            cena += 3000;
        }


        long years = ChronoUnit.YEARS.between(dataProdukcji, data);
        if (years > 5) {
            cena -= 0.2 * cena;
        }
        return cena;

    }
}
