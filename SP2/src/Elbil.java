public class Elbil extends Bil
{
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "\n\nElbil" +
                "\nBatterikapacitet KWh = " + batterikapacitetKWh +
                "\nMaxKm = " + maxKm +
                "\nWhPrKm = " + whPrKm +
                "\nRegNr = " + regNr +
                "\nMærke='" + mærke +
                "\nModel='" + model +
                "\nÅrgang=" + årgang +
                "\nAntalDøre=" + antalDøre;
    }

    @Override
    public double beregnGrønEjerafgift()
    {
        double x;
        x = 100/(whPrKm/91.25);
        if ( x < 5)
        {
            return 10470;
        }
        if (5 <= x && x < 10)
        {
            return 5500;
        }
        if (10 <= x && x < 15)
        {
            return 2340;
        }
        if (15 <= x && x < 20)
        {
            return 1050;
        }
        if (20 <= x && x < 50)
        {
            return 330;
        }
        return 0;

        }

    }
