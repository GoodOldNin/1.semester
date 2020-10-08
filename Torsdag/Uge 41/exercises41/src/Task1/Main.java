package Task1;

public class Main {
    public static void main(String[] args) {
    // psvm + tab
        //proper  programming... variables constructor getset and tostring
    Driver driver1 = new Driver("Ole",35);
    Car car1 = new Car("Ford","Focus",2018,"ugly");
    car1.setDriver(driver1);
        System.out.println(car1);
        System.out.println(car1.getDriver().toString());   // sout tap


    Car car2 = new Car("Opel","Astra",1999,"smooth");
    car2.setDriver(driver1);
        System.out.println(car2.toString() +" "+ driver1.toString());
    }

}
