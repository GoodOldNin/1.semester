import java.util.ArrayList;
import java.util.List;

public class Garage
{
    List<Bil> myGarage;
    String navn;
    public Garage(String navn)
    {
        this.myGarage = new ArrayList<>();
        this.navn = navn;
    }

    public void addCar(Bil a)
    {
        myGarage.add(a);
    }
}
