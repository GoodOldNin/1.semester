package Task1;

public class Car {

    /* has-a
    Make
    Model
    Year
    BodyStyle
    Driver
     */

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public String toString() {
        return "Make = " + make +
                ", Model = " + model + "("+year+")" +
                ", BodyStyle = " + bodyStyle;
    }



    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


}
