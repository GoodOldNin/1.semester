class Dieselbil extends Bil
{
    public boolean harPartikelFilter;
    public int kmPrL;

    public Dieselbil(int regNr, int mærke, int model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean getHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter)
    {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "regNr=" + regNr +
                ", mærke=" + mærke +
                ", model=" + model +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelFilter=" + harPartikelFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift()
    {
        if ( kmPrL < 5 && harPartikelFilter == true)
        {
            return 15260;
        }
        if (5 <= kmPrL && kmPrL < 10 && harPartikelFilter == true)
        {
            return 2770;
        }
        if (10 <= kmPrL && kmPrL < 15 && harPartikelFilter == true)
        {
            return 1850;
        }
        if (15 <= kmPrL && kmPrL < 20 && harPartikelFilter == true)
        {
            return 1390;
        }
        if (20 <= kmPrL && kmPrL < 50 && harPartikelFilter == true)
        {
            return 130;
        }
        if ( kmPrL < 5 && harPartikelFilter == false)
        {
            return 16260;
        }
        if (5 <= kmPrL && kmPrL < 10 && harPartikelFilter == false)
        {
            return 3770;
        }
        if (10 <= kmPrL && kmPrL < 15 && harPartikelFilter == false)
        {
            return 2850;
        }
        if (15 <= kmPrL && kmPrL < 20 && harPartikelFilter == false)
        {
            return 2390;
        }
        if (20 <= kmPrL && kmPrL < 50 && harPartikelFilter == false)
        {
            return 1130;
        }
        return 0;
    }
}