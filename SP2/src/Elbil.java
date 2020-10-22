public class Elbil {
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int batterikapacitetKWh, int maxKm, int whPrKm) {
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
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift()
    {
        int x;
        100/(whPrKm/91.25) = x;
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
}
