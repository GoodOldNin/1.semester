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

    @Override
    public String toString() {
        return "My Garage:\n\n" + myGarage;
    }
    public double beregnGrønAfgiftForBilpark()
    {
        double totalAfgift = 0;
        for (Bil b: myGarage)
        {
            totalAfgift += b.beregnGrønEjerafgift();
        }
        return totalAfgift;
    }
}
