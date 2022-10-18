ОУБЛИК КЛАС НАМЕД КАР
public class Car

{

    private String brand;

    private String model;

    private int year;



    public String getBrand()

    {

        return brand;

    }

    public String getModel()

    {

        return model;

    }

    public int getYear()

    {

        return year;

    }

    public void setBrand(String newBrand)

    {

        this.brand = newBrand;

    }

    public void setModel(String newModel)

    {

        this.model = newModel;

    }

    public void setYear(int newYear)

    {

        this.year = newYear;

    }



}










    ДЕФАУЛТ ВАЛУЕС










public class Car {

    private String brand;

    public String getBrand() {

        return brand;

    }

    public void setBrand(String brand) {

        this.brand = brand;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getFuelQuantity() {

        return fuelQuantity;

    }

    public void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;

    }

    public double getFuelConsumption() {

        return fuelConsumption;

    }

    public void setFuelConsumption(double fuelConsumption) {

        this.fuelConsumption = fuelConsumption;

    }

    private String model;

    private int year;

    private double fuelQuantity;

    private double fuelConsumption;



    public Car() {

        this.brand = "VW";

        this.model = "Golf";

        this.year = 2025;

        this.fuelQuantity = 200;

        this.fuelConsumption = 10;



    }



    public Car(String brand, String model, int year) {

        this();

        this.brand = brand;

        this.model = model;

        this.year = year;

    }




    public Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption) {

        this(brand, model, year);

        this.fuelQuantity = fuelQuantity;

        this.fuelConsumption = fuelConsumption;

    }

}

public class Car {

    private String brand;

    private String model;

    private int year;

    private double fuelQuantity;

    private double fuelConsumption;

    Engine engine = new Engine(year, fuelConsumption);

    Tire[] tire = new Tire(year, fuelConsumption);

    public String getBrand() {

        return brand;

    }

    public void setBrand(String brand) {

        this.brand = brand;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getFuelQuantity() {

        return fuelQuantity;

    }

    public void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;

    }

    public double getFuelConsumption() {

        return fuelConsumption;

    }

    public void setFuelConsumption(double fuelConsumption) {

        this.fuelConsumption = fuelConsumption;

    }

    public Engine getEngine() {

        return engine;

    }

    public void setEngine(Engine engine) {

        this.engine = engine;

    }

    public Tire[] getTire() {

        return tire;

    }

    public void setTire(Tire[] tire) {

        this.tire = tire;

    }

    void drive(double distance) {

        if (fuelQuantity - distance * fuelConsumption > 0) {

            fuelQuantity = fuelQuantity - (distance * fuelConsumption);

        } else {

            System.out.println("Not enough fuel to perform this trip!");

        }

    }

    String WhoAmI() {

        return "brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year + "\nFuel: " + this.fuelQuantity + "L";

    }

    Car() {

        this.brand = "VW";

        this.model = "Golf";

        this.year = 2025;

        this.fuelQuantity = 200;

        this.fuelConsumption = 10;

    }

    public Car(String brand, String model, int year) {

        this();

        this.brand = brand;

        this.model = model;

        this.year = year;

    }

    public Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption) {

        this(brand, model, year);

        this.fuelQuantity = fuelQuantity;

        this.fuelConsumption = fuelConsumption;

    }
















    public Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption, Engine engine, Tire[] tire) {

        super();

        this.brand = brand;

        this.model = model;

        this.year = year;

        this.fuelQuantity = fuelQuantity;

        this.fuelConsumption = fuelConsumption;

        this.engine = engine;

        this.tire = tire;

    }

}

public class Engine {

    private int horsePower;

    private double cubicCapacity;

    public int getHorsePower() {

        return horsePower;

    }

    public void setHorsePower(int horsePower) {

        this.horsePower = horsePower;

    }

    public double getCubicCapacity() {

        return cubicCapacity;

    }

    public void setCubicCapacity(double cubicCapacity) {

        this.cubicCapacity = cubicCapacity;

    }

    public Engine(int horsePower, double cubicCapacity) {

        super();

        this.horsePower = horsePower;

        this.cubicCapacity = cubicCapacity;

    }

}

public class Tire {

    private int year;

    private double pressure;

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getPressure() {

        return pressure;

    }

    public void setPressure(double pressure) {

        this.pressure = pressure;

    }

    public Tire(int year, double pressure) {

        super();

        this.year = year;

        this.pressure = pressure;

    }

}







    DA SUSDADEM CLASS CAR S POVECHE RABOTI






public class Car {

    private String brand;

    private String model;

    private int year;

    private double fuelQuantity;

    private double fuelConsumption;



    public String getBrand() {

        return brand;

    }

    public void setBrand(String brand) {

        this.brand = brand;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getFuelQuantity() {

        return fuelQuantity;

    }

    public void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;

    }

    public double getFuelConsumption() {

        return fuelConsumption;

    }

    public void setFuelConsumption(double fuelConsumption) {

        this.fuelConsumption = fuelConsumption;

    }





    void drive(double distance)

    {

        if((fuelQuantity - distance * fuelConsumption) > 0)

        {

            fuelQuantity = fuelQuantity - (distance * fuelConsumption);

        }

        else

        {

            System.out.println("Not enough fuel to perform this trip!");

        }

    }



    String WhoAmI()

    {

        return "brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year + "\nFuel: " + this.fuelQuantity + "L" ;

    }



    Car()

    {

        this.brand = "VW";

        this.model = "Golf";

        this.year = 2025;

        this.fuelQuantity = 200;

        this.fuelConsumption = 10;

    }



    Car(String brand, String model, int year)

    {

        this();

        this.brand = brand;

        this.model = model;

        this.year = year;

    }



    Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption)

    {

        this(brand, model, year);

        this.fuelQuantity = fuelQuantity;

        this.fuelConsumption = fuelConsumption;

    }



}
