package car;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car {

    private Color color;
    private Brand brand;
    private FuelType fuelType;
    private GearBoxType gearBoxType;
    private EquipmentStandard equipmentStandard;
    private LocalDate productionDate;

    public Car(Color color, Brand brand, FuelType fuelType, GearBoxType gearBoxType, EquipmentStandard equipmentStandard, LocalDate productionDate) {
        this.color = color;
        this.brand = brand;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.equipmentStandard = equipmentStandard;
        this.productionDate = productionDate;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public EquipmentStandard getEquipmentStandard() {
        return equipmentStandard;
    }

    public void setEquipmentStandard(EquipmentStandard equipmentStandard) {
        this.equipmentStandard = equipmentStandard;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public int calculate() {
        if (equipmentStandard == EquipmentStandard.VIP && color != Color.BLACK) {
            throw new IllegalStateException("VIP might be only black");
        }

        if (brand == Brand.FIAT && fuelType == FuelType.DIESEL) {
            throw new IllegalStateException("There is no Fiat with diesel");
        }

        if (brand == Brand.AUDI && equipmentStandard == EquipmentStandard.BASIC) {
            throw new IllegalStateException("Audi is only in VIP and premium standard");
        }

        int cena = 0;

        cena += brand.getValue();
        cena += color.getValue();
        cena += fuelType.getValue();
        cena += gearBoxType.getValue();
        cena += equipmentStandard.getValue();

        if (color == Color.RED && equipmentStandard == EquipmentStandard.PREMIUM) {
            cena += 3000;
        }

        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(productionDate, today);
        if (years > 5) {
            cena -= 0.2 * cena;
        }
        return cena;
    }

    public int calculatePriceAtDate(LocalDate data) {
        if (equipmentStandard == EquipmentStandard.VIP && color != Color.BLACK){
            throw new IllegalStateException("VIP might be only BLACK");
        }

        if (brand == Brand.FIAT &&  fuelType == FuelType.DIESEL) {
            throw new IllegalStateException("There is no Fiat with Diesel");
        }

        if (brand == Brand.AUDI && equipmentStandard == EquipmentStandard.BASIC) {
            throw new IllegalStateException("Audi is only in VIP and premium standard");
        }

        int price = 0;

        price += brand.getValue();
        price += color.getValue();
        price += fuelType.getValue();
        price += gearBoxType.getValue();
        price += equipmentStandard.getValue();

        if (color == Color.RED && equipmentStandard == EquipmentStandard.PREMIUM) {
            price += 3000;
        }

        long years = ChronoUnit.YEARS.between(productionDate, data);
        if (years > 5) {
            price -= 0.2 * price;
        }
        return price;

    }
}
