class Benzinbil extends Bil
{
    public int oktantal;
    public int kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil\n" +
                "RegNr = " + regNr +
                "\nMærke = " + mærke +
                "\nModel = " + model +
                "\nÅrgang = " + årgang +
                "\nAntalDøre = " + antalDøre +
                "\nOktantal = " + oktantal +
                "\nKm Per Liter = " + kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift()
    {
        if ( kmPrL < 5)
        {
            return 10470;
        }
        if (5 <= kmPrL && kmPrL < 10)
        {
            return 5500;
        }
        if (10 <= kmPrL && kmPrL < 15)
        {
            return 2340;
        }
        if (15 <= kmPrL && kmPrL < 20)
        {
            return 1050;
        }
        if (20 <= kmPrL && kmPrL < 50)
        {
            return 330;
        }
        return 0;

    }
}
