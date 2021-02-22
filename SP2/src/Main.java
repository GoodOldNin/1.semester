public class Main {

    public static void main(String[] args) {
        Garage g1 = new Garage("myGarage");
        Benzinbil b1 = new Benzinbil("AU23222","Mercedes","E63",2020,5,100,12);
        Dieselbil d1 = new Dieselbil("PQ32312","Mercedes","Sprinter",2020,4,true,18);
        Elbil e1 = new Elbil("SY91212","Tesla","model S",2020,3,100,647,220);
        g1.addCar(b1);
        g1.addCar(d1);
        g1.addCar(e1);

        System.out.println(g1);
        System.out.println("\nTotal beregnet grøn afgift =");
        System.out.println(g1.beregnGrønAfgiftForBilpark());

    }
}
